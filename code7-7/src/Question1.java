    /*    输入
        Hello world Here I Come
        输出
        ComeI Here world Hello*/
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String result ="";
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            for (int i = strings.length - 1;i >= 0; i-- ) {
                if(i == strings.length -1) {
                     result = strings[i];
                }else  {
                    result += " " + strings[i];
                }
            }
            System.out.println(result);
        }
    }
}
