import java.util.Scanner;
public class TestThread8 {
    //wait 和 notify 解决线程问题。
    //notifyAll 唤醒所有等待
    public static void main(String[] args) {
        Object locker= new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (locker) {
                    System.out.println("wait 开始");
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait 结束");
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("**************");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                synchronized (locker) {
                    System.out.println("notify开始");
                    locker.notify();
                    System.out.println("notify结束");
                }
            }
        };
        t2.start();
    }
}
