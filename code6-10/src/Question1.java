import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int result = 0;
            int a = scanner.nextInt();
            /*//n的大小一大int存不下
            for (int i = a - 1;i > 0;i--) {
                a *= i;
            }
            while(a != 0) {
                if(a % 10 == 0) {
                    result++;
                }
                a /= 10;
            }*/
            for (int i = 5; i <= a; i *= 5) {
                result += a / i;
            }
            System.out.println(result);
        }
    }
}
