import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//输入一串用空格连接的数 输出前K大的数用空格连接
public class Question2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            while(sc.hasNext()) {
                ArrayList<Integer> arraylist= new ArrayList<>();
                String s = sc.nextLine();
                String str = "";
                String [] strs = s.split(" ");
                int le = strs.length;
                for(int i = 0; i < le -1; i++) {
                    arraylist.add(Integer.valueOf(strs[i]));
                }
                Collections.sort(arraylist);
                int k = Integer.valueOf(strs[le -1]);
                for(int j = 0;j < k; j++) {
                    if(j < k -1) {
                        str +=  arraylist.get(j) + " ";

                    } else {
                        str += arraylist.get(j);
                    }
                }
                System.out.println(str);
            }
        }
}
