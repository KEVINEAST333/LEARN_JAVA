import java.util.Scanner;

public class HomeWork {
    public static void print(int num) {
       /* while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }*/
        if (num > 9) {
            print(num / 10);
        }
            System.out.println(num % 10);
    }
    public static int sum(int num) {
        if (num <10) {
            return num;
        }
        else {
            return(num % 10 +sum(num / 10));
        }
    }
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        else {
            return (fib(n - 2) +fib (n - 1));
        }
    }
    public static void move(char pos1,char pos3) {
        System.out.print(pos1+"->"+pos3+" ");
    }

    public static void hanio(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
        move(pos1,pos3);
        }
        else {
            hanio(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanio(n-1,pos2,pos1,pos3);
        }
    }
    public static int add(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n + add(n - 1));
        }
    }
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * fac(n - 1);
        }
    }


        public static void main (String args[]){
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
           /* print(n);
            // 123 打印 1  2  3 递归
            int a = sum (n);
            System.out.println(a);*/

            // 124  4 + 2 + 1
//            int a = fib(n + 1);
            /*int f1 = 1;
            int f2 = 2;
            int f3 = 1;
            if (n == 2) {
                 f3 = 2;
            }
            else {
                for (int i = 3; i <= n;i++) {
                    f3 = f1 + f2;
                    f1 = f2;
                    f2 = f3;
                }
            }
            System.out.println(n + "阶台阶有" + f3 + "种跳法");*/

            /*hanio(n, 'A', 'B','C');*/
           /* System.out.println(add(n));*/
            System.out.println(fac(n));

        }
    }
