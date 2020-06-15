import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int min = n;
            int f1 = 0;
            int f2 = 1;
            int f = 0;
          if(n == 0 || n == 1) {
              min =  0;
          }
          for(int i = 0; i < 40;i++) {
              f = f1 + f2;
              if(n >= f && n-f < min) {
                  min = n-f;
              }
              if(n <= f && f-n < min) {
                  min = f-n;
              }
              f1 = f2;
              f2 = f;
          }
            System.out.println(min);
        }
    }
}
