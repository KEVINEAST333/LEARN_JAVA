import java.util.Scanner;
import java.util.Random;
public class Work {
    public static void main(String args[]) {/*
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                sum++;

            }
			if (i / 10 == 9) {
				sum++;
			}
			

        }
        System.out.println(sum);*/
        // 1到 100 的所有整数中出现多少个数字9

        /*for (int i = 1000; i <= 2000; i++) {
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i);
            }
        }*/
        //输出 1000 - 2000 之间所有的闰年
     /*   int i = 2;
        int j = 2;
        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (j == i) {
                System.out.println(i);
            }
        }*///打印 1 - 100 之间所有的素数

       /* int i = 2;
        int j = 2;
        for (i = 2; i <= 100; i++) {
            boolean flag = true;
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println(i);
            }
        }*///打印 1 - 100 之间所有的素数


      /*  int j = 2;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            for (j = 2; j <= n - 1; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println(n + "是素数");
            } else {
                System.out.println(n + "不是素数");

            }

        }*///判断一个数是不是素数。

        /*System.out.println("请输入年龄");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int age = scan.nextInt();
            if (age <= 18) {
                System.out.println("少年");
            }
            else  if (age <=28 ){
                System.out.println("青年");
            }
            else  if (age <= 55 ){
                System.out.println("中年");
            }
            else  {
                System.out.println("老年");
            }
        }*/
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)


        /*Random radm = new Random();
        int answr = radm.nextInt(10);
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int guess = scan.nextInt();
            if (guess < answr) {
                System.out.println("猜小了");
            }
            else if (guess == answr) {
                System.out.println("猜对了");
                break;
            }
            if (guess > answr) {
                System.out.println("猜大了");
            }
        }*/
        // 完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序

       /* int i = 0;
        int d = 0;
        for (i = 100; i <= 999; i++) {
            d = i;
            int j = i;
            int a = j / 100;//百位
            j = j % 100;
            int b = j / 10;//十位
            j = j % 10;
            int c = j;//个位
            if (((a * a * a )+ (b * b * b) + (c * c * c)) == d) {
                System.out.println(d);
            }
        }*/
        //求出0～999之间的所有水仙花数

       /* int i = 1;
        int  j = 2;
        float sum1 = 0;
        float sum2 = 0;
        float sum = 0;
        while (i <= 100) {
            sum1 += 1.0 / i;
            i += 2;
        }
        for (j = 2; j <= 100;j += 2) {
            sum2 += -1.0 / j;
        }
        sum = sum1 + sum2;
        System.out.println(sum);*/

        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值

      /* int max = 0;
       int min = 0;
       int temp = 0;
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       max = a > b ? a : b;
       min = a > b ? b : a;
       while (max % min != 0) {
           temp = max % min;
           max = min;
           min = temp;
       }
       System.out.println( a + "和" + b +"最大公约数为" + min);*/
      //求两个正整数的最大公约数

        /*Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {//如果还有下一个对象，那么执行以下的句子
            int n = scan.nextInt();
            int flag = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    flag++;
                }
                n = n >>> 1; //无符号右移 防止负数死循环
            }
            System.out.println(flag);
            //求一个整数，在内存当中存储时，二进制1的个数
        }*/

    }

    }



