public class TestThread3 {
    public static void main(String[] args) throws InterruptedException {
        //join 关键字
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0;i < 10;i++) {
                    System.out.println("我是线程1");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for(int i = 0;i < 10;i++) {
                    System.out.println("我是线程2");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        for (int i = 0;i < 10;i++) {
            System.out.println("我是主线程");
        }
    }
}
