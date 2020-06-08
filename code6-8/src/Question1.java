import java.util.Scanner;
//输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C
//求A B C
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            float A = (a + c) / 2f;
            float B = (b + d) / 2f;
            float C = (d - b) / 2f;
            if(A - ((a + c) / 2 )!= 0 ) {
                System.out.println("No1");
                return;
            }
            if( B - ((b + d) / 2 ) != 0 || B - ((c - a) / 2) != 0 ) {
                System.out.println("No2");
                return;
            }  if( C - ((d - b) / 2 )!= 0 ) {
                System.out.println("No3");
                return;
            }
            System.out.println((int)A + " " + (int)B + " " +(int) C);
        }
    }
}
