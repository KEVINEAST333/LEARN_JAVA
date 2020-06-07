public class TestThread4 {
    static class Counter {
        public int count = 0;
        //没有加锁 线程不安全 (多线程并发执行时产生了逻辑上的错误)
        //不安全原因
        //1.线程是抢占式执行的
        //2.自增操作 不是原子性的
        // 每次++都可分为 三步
        // 1)load 把数据加载到CPU上 2)increase 把CPU上的数据++ 3)save 把数据写会CPU
        //抢占式导致冲途 完全并发 50000 完全串行是100000 代码真正执行结果在两者之间
        //3.多个线程同时修改一个变量.
        public void increase() {
            count++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread("ssss") {
            @Override
            public void run() {
                for (int i = 0;i < 50000;i++) {
                    counter.increase();
                }
            }
        };
        Thread t2 = new Thread("rrrr") {
            @Override
            public void run() {
                for (int i = 0;i < 50000;i++) {
                    counter.increase();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //值为 50000 ~ 100000
        System.out.println(counter.count);
    }
}
