import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestExam {
   public static void main(String[] args) {
       //1.处理输入
       String s = "";
       int count = 0;
       Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext()) {
           String a = scanner.next();
           String b = scanner.next();
           char B = b.charAt(0);
           //System.out.println(b);
           ArrayList<Character> list = new ArrayList<>();
           for(int i = 0;i < a.length(); i++) {
               list.add(a.charAt(i));
           }
           for(int j = 0; j <= a.length();j++) {
               list.add(j,B);
               System.out.println(list.toString());
               for(int k = 0; k <= a.length();k++) {
                   s += "" + list.get(k);
               }
               //判断一下是否是回文
               StringBuilder sb = new StringBuilder(s);
               sb.reverse();
               System.out.println(sb);
               String s2 = new String(sb);
               if(s.equals(s2)) {
                   count ++;
               }
               list.remove(j);
               s = "";
           }
           System.out.println(count);
           count = 0;
       }
   }
}
