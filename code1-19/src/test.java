import java.util.Scanner;

public class test {
    public static void main(String[] args){

        System.out.println("请输入两个整数");
        Scanner i = new Scanner(System.in);
//        Scanner j = new Scanner(System.in) ;
        int x,y;
        x = i.nextInt();
        y = i.nextInt();
        System.out.println(x+"+"+y+"="+(x+y));

    }
}  // java 实现加法
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println((foot + inch/12)*0.3048);



    }
}  //英制单位转换成公制单位