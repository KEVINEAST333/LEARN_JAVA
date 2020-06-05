import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if(n < 6 || n == 10 || n % 2 != 0) {
                System.out.println(-1);
            }
            else if(n % 8 == 0) {
                System.out.println(n/8);
            } else {
                System.out.println(1 + n/8);
            }
        }
    }
}
