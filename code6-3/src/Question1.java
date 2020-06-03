import java.util.Scanner;
//喝汽水三个空瓶换一瓶拿N个空瓶能换多少汽水
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int result = 0;
            int n = scanner.nextInt();
            while(n > 2) {
                int tmp = n % 3;
                n = n / 3;
                result += n;
                n = n + tmp;
            }
            if(n == 2) {
                System.out.println(result + 1);
            } else {
                System.out.println(result);
            }
        }
    }
}
