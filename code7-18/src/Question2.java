
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int[] result = {0, 0};
            String[] strings = str.split(";");
            for (int i = 0; i < strings.length; i++) {
                if (!"".equals(strings[i])) {
                    char a = strings[i].charAt(0);
                    if ((a == 'W') || (a == 'A') || (a == 'S') || (a == 'D')) {
                        String b = strings[i].substring(1, strings[i].length());
                        boolean flag = b.matches("[0-9]+");
                        if (flag == true) {

                            move(a, b, result);
                        }
                    }
                }
            }
            System.out.println(result[0] + "," + result[1]);
        }
    }
    private static void move(char a, String b, int[] result) {
        int x  = Integer.parseInt(b);
        if (a == 'A') {
            result[0] -= x;
        } else if( a == 'D') {
            result[0] += x;
        } else if( a == 'W') {
            result[1] += x;
        } else if(a == 'S') {
            result[1] -= x;
        }
        }
}

