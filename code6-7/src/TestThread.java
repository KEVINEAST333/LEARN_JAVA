public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (!Thread.currentThread().interrupted()) {
                    System.out.println("别管我正在转账");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                System.out.println("转账被终止了");
            }
        };
        t.start();
        Thread.sleep(5000);
        System.out.println("对方是内鬼终止交易");
        //1.当程序是被 sleep wait 阻塞时这个interrupt方法会抛出一个异常
        //2.当程序是被其他原因阻塞时会把 Thread.interrupted() 置为true (置为true 之后又会恢复到false)
        //Thread.currentThread().interrupted() 这个置为true之后不会恢复
        t.interrupt();
    }
}
