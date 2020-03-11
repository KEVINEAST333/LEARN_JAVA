import java.util.Scanner;

public class HomeWork {
    public static int fib (int n) {
        if (n <= 2) {
            return 1;
        }
        else {
            return (fib(n - 1) + fib (n - 2));
        }
    }
    public static int fac (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * fac (n - 1);
        }
    }
    public static int max2 (int x,int y) {
        return x >= y ? x : y;
    }
    public static double max2 (double x,double y) {
        return x >= y ? x : y;
    }
    public static int max3 (int x,int y) {
        return x >= y ? x : y;
    }
    public static int add(int x,int y) {
        return x + y;
    }
    public static double add (double x,double y,double z) {
        return (x + y + z);
    }

    public static void main (String args[]) {
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = fib(a);
        System.out.println(b);*/
        //求斐波那契数列的第n项。(迭代实现)

        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        for (int i = a;i >= 1;i--) {
            sum += fac(i);
        }
        System.out.println(sum);*/
        //求1！+2！+3！+4！+........+n!的和

        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = fac(a);
        System.out.println(b);*/
        //求 N 的阶乘

        /*int [] arr = {1, 3, 5, 10, 2, 6, 7, 8};
        int [] b = new int [arr.length];
        int j = 0;
        int k = arr.length - 1;
        for (int i = 0;i < arr.length;i++) {
            if (arr [i] % 2 != 0) {
                b [j] = arr[i];
                j++;
            }
            else {

                b [k] = arr[i];
                k--;
            }
        }
        for (int i = 0;i < arr.length;i++) {
        System.out.print(b[i] + " ");
        }*/
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序

        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = max3((max2(a,b)),c);
        System.out.println(d);*/
        //三个数最大值
        /*Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        int c = scan.nextInt();
        System.out.println(max2(max2(a,b),c));*/
        //不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(add(a,b));
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        System.out.println(add(c,d,e));
    }
}
