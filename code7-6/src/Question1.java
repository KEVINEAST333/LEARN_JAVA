//输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数(如'3’，输出：10110011)。
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            char[] array = s.toCharArray();
            for (char c : array) {
                // 把字符转成实际内存中存取的数字二进制
                String s1 = Integer.toBinaryString(c);
                //把格式改为存储七位
                String s2 = String.format("%07d", Integer.parseInt(s1));
                int count = 0;
                //根据1的个数加上校验位
                  for (int j = 0; j < 7; j++) {
                     if (s2.charAt(j) == '1') {
                         count++;
                     }
                }
                System.out.println(count % 2 == 0 ? "1" + s2 : "0" + s2);
            }
        }
    }
}
