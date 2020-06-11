import java.util.Scanner;

public class Question1 {
    //求n 与斐波那契数 最小差值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int min = n;
            int f1 = 0;
            int f2 = 1;
            if(n == 0) {
                min = 0;
            }
            if (n == 1) {
                min = 0;
            }
            if(n >= 2) {
                for (int i = 0;i <= 40; i++) {
                    int f = f1 + f2;
                    if((n - f) < min && (n-f) >= 0) {
                        min = n - f;
                    }
                    if((f - n) < min && (n-f) <= 0) {
                        min = f - n;
                    }
                    f1 = f2;
                    f2 = f;
                }
            }
            System.out.println(min);
        }
    }
}
