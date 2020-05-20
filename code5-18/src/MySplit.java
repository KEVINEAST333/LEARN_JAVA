import java.util.ArrayList;
import java.util.List;

public class MySplit {
    public static String[] splitString(String str, String flag) {
        List<String> list = new ArrayList<String>();
        while (str.contains(flag)) {
            int index = str.indexOf(flag);
            String tmp = str.substring(0, index);
            list.add(tmp);
            str = str.substring(index + flag.length());
        }
        list.add(str);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        String s = "dalfsfasfsfa";
        String[] a = splitString(s,"fa");
        for(String c : a) {
            System.out.println(c);
        }
    }
}
