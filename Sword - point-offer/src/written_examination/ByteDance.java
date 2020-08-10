package written_examination;

import java.util.ArrayList;
import java.util.Scanner;

public class ByteDance {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            ArrayList<String> arraylist = new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();

            int n = scan.nextInt();
            for(int i = 0;i < n;i++) {
                arraylist.add(scan.next());
            }
            for(int j = 0 ;j < n;j++) {
                char[] chars = arraylist.get(j).toCharArray();
                String str = changeStr(chars);
                list.add(str);
            }
            for(int l = 0; l < list.size();l++) {
                System.out.println(list.get(l));
            }
        }
    }
    public static String changeStr(char[] chars) {
        ArrayList<Character> arraylist = new ArrayList<>();
        String str = "";
        for(int k = 0; k < chars.length;k++) {
            arraylist.add(chars[k]);
        }
        for(int i = 0; i < chars.length - 5 ;i++) {
            if((arraylist.get(i) == arraylist.get(i + 1) )&&  (arraylist.get(i + 1) == arraylist.get(i + 3))) {
                arraylist.remove(i+3);
            }
            if((arraylist.get(i) == arraylist.get(i + 1))&&  (arraylist.get(i + 2) == arraylist.get(i + 3))) {
                arraylist.remove(i+3);
            }
        }
        for(int j = 0; j < arraylist.size();j++) {
            str = str + arraylist.get(j);
        }
        return str;
    }
}
