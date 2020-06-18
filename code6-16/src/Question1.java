import java.util.Scanner;

public class Question1 {
    /*VVVVVVVVVV  输入 10 V; 输出矩形
    V        V
    V        V
    V        V
    VVVVVVVVVV*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String str1 = "";
            String str2 = "";
            for(int i = 0;i < n;i++) {
                str1 += s;
                if(i == 0 || i == n - 1) {
                    str2 += s;
                } else {
                    str2 += " ";
                }

            }
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = n / 2 + 1;
            }
            System.out.println(str1);
            for(int j = 2;j < n;j++) {
                System.out.println(str2);
            }
            System.out.println(str1);
        }
    }
}
