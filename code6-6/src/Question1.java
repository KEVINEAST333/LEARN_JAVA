import java.util.Scanner;
public class Question1 {
    static int result;
    static int [] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int N  = n + 1;
            array = new int[N];
            for(int i = 1;i <= n;i++) {
                array[i] = scanner.nextInt();
                }
            findKind(40, n);
            System.out.println(result);
            result = 0;
        }
    }

    private static void findKind(int s, int k) {
        if(s == 0) {
            result++;
            return;
        }
        if(s < 0 || (s > 0 && k < 1)) {
            return;
        }
        findKind(s - array[k],k - 1);
        findKind(s ,k - 1);
    }
}
