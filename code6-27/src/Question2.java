import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
/*A1 =能被5整除的数字中所有偶数的和;
        A2 =将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-4...;
        A3 =被5除后余2的数字的个数;
        A4 =被5除后余3的数字的平均数，精确到小数点后1位;
        A5 =被5除后余4的数字中最大数字。*/

public class Question2 {
    public static void main(String[] args) {
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;
        int k = 0;
        int n = 1;
        int a = -1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(scanner.hasNext()) {
            arrayList.add(scanner.nextInt());
        }
        int len = arrayList.size();
        for (int i = 0;i < len;i++) {
            int value = arrayList.get(i);
            if(value % 5 == 0 && value % 2 == 0) {
                A1 += value;
            }
            if(value % 5 == 1) {
                a = -a;
                A2 = A2 + value * a ;
                n++;
            }

            if(value % 5 == 2) {
                A3++;
            }
            if(value % 5 == 3) {
                k++;
                A4 += value;
            }
            if(value % 5 == 4 && value > A5) {
                A5 = value;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        A4 = A4 / k;
        /*System.out.print(A1);
        System.out.print(A2);
        System.out.print(A3);
        System.out.print(decimalFormat.format(A4));
        System.out.print(A5);

*/
        System.out.println(A1 + " " + A2 + " " + A3 + " " + A4 + " "+ A5 );
    }
}
