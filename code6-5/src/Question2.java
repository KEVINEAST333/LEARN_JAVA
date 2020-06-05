import java.util.Scanner;
import java.util.*;
/*
输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。 例如，输入”
        They are students. "和"aeiou",则删除之后的第一个字符串变成 Thy r stdnts."
*/

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String [] s = new String [str2.length()];
            String a = "";
            for (int i = 0;i < str2.length();i++) {
                s[i] = "" + str2.charAt(i);
                a = str1.replaceAll(s[i], "");
                str1 = a;
            }
            System.out.println(a);
        }
    }
}
