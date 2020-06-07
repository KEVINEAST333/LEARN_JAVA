public class TestThread5 {
        static  class Counter2 {
            public int count = 0;
            public int count2 = 0;
            //synchronized 关键字进行加锁操作
            //synchronized可以对某个对象进行加锁
            //进入increase方法会尝试加锁 方法执行完毕会解锁
            //加锁之后其他线程调用这个方法会阻塞需要上一个线程执行完后解锁才能继续运行
            synchronized public void increase2() {
                count2++;
            }
            //线程不安全的写法 ->多线程并发执行时产生了逻辑上的错误.
             public void increase() {
                count++;
            }
        }
        public static void main(String[] args) throws InterruptedException {
            Counter2 counter2 = new Counter2();
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0;i < 50000;i++) {
                        counter2.increase();
                        counter2.increase2();
                    }
                }
            };
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0;i < 50000;i++) {
                        counter2.increase();
                        counter2.increase2();
                    }
                }
            };
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            //值为 50000 ~ 100000
            System.out.println(counter2.count);
            //值为100000
            System.out.println(counter2.count2);
        }
    }
