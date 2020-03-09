import java.util.Scanner;

public class HomeWork {
    public static void get(int a) {
        System.out.print("奇数位:");
        int b = a;
        for (int i = 31; i >= 0; i -= 2) {
            int x = (a >>> i) & 1;
            System.out.print(x + "  ");
        }
        System.out.print("偶数位:");
        for (int i = 30; i >= 0; i -= 2) {
            int y = (b >>> i) & 1;
            System.out.print(y + "  ");
        }

    }
    public static void everyOne (int x) {
        while(x != 0){
            int a = x % 10;
            x = x / 10;
            System.out.println(a);
        }
    }
    public static void MultiplicationTips (int x) {
        for (int i = 1;i <= x;i ++) {
            for (int j = i;j <= x;j++){
                System.out.printf(i + "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String args[]) {
       /* Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        get(x);*/
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列

       /* Scanner scan = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String password = scan.next();
            if (password.equals("wangdong")) {
                System.out.println("密码正确");
                break;
            } else {
                count--;
                System.out.println("密码错误你还有" + count + "次机会");
            }
        }*/
        //代码模拟三次密码输入的场景

        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        everyOne(n);*/
        //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MultiplicationTips(n);
    }
}
