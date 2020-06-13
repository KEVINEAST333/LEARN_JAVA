import java.util.TimerTask;

public class TestClass {
    //阻塞队列 -> 生产者消费者模型(只有生产出来的才能消费)
    static class BlockingQueue {
        //用一个object 实现锁操作
        Object object = new Object();
        //基于数组是实现队列
        private int [] array = new int [1000];
        //用volatile 保持内存可见性
        private volatile int head = 0;
        private volatile int tail = 0;
        private volatile int size = 0;
        //入阻塞队列方法 put
        public void put(int value) throws InterruptedException {
            //队列再满了阻塞
            synchronized (object) {
                while (size == array.length) {
                    object.wait();
                }

                array[tail] = value;
                tail++;
                if (tail == array.length) {
                    tail = 0;
                }
                size++;
                //唤醒 take wait;
                object.notify();
            }
        }
        public int take () throws InterruptedException {
            int ret;
            synchronized (object) {
                //如果队列没有元素就阻塞等待生产者加入元素 notifyAll唤醒
                if(size == 0) {
                    object.wait();
                }
                ret = -1;
                ret = array[head];
                head ++;
                if(head == array.length) {
                    head = 0;
                }
                size--;
                //唤醒 put wait;
                object.notify();
            }
            return ret;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();
        // 搞两个线程, 分别模拟生产者和消费者.
        // 第一次, 让给消费者消费的快一些, 生产者生产的慢一些.
        // 此时就预期看到, 消费者线程会阻塞等待. 每次有新生产的元素的时候, 消费者才能消费
        // 第二次, 让消费者消费的慢一些, 生产者生产的快一些.
        // 此时就预期看到, 生产者线程刚开始的时候会快速的往队列中插入元素, 插入满了之后就会阻塞等待.
        // 随后消费者线程每次消费一个元素, 生产者才能生产新的元素.
        Thread producer = new Thread() {

            @Override
            public void run() {
                for(int i = 0;i < 1000;i++) {
                    try {
                        blockingQueue.put(i);
                        System.out.println("生产者 " + i);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();
        Thread customer = new Thread() {
            @Override
            public void run() {
                while(true) {
                    try {
                        int ret = blockingQueue.take();
                        System.out.println("消费者 " + ret);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        customer.start();
    }
}
