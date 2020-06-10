import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int a = scanner.nextInt();
            String s = "" + a;
            StringBuilder sb = new StringBuilder(s);
            sb = sb.reverse();
            System.out.println(sb);
        }
    }
}
