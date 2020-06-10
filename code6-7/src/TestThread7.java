import java.util.Scanner;

public class TestThread7 {
    static class Counter {
        //volatile 关键字保持内存可见性 强制cpu从内存中读数据 而不是优化后从寄存器中读.
       public volatile int flag = 0;
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (counter.flag == 0) {

                }
                System.out.println("循环结束");
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("**********");
              counter.flag = scanner.nextInt();
                System.out.println("更改flag");
            }
        };
        t2.start();
    }
}
