import java.sql.Connection;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        String result = "";
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            list2.add(a);
        }
        for(int i = 0;i < list2.size();i++) {
            for (int j = 0; j < list2.get(i);j++) {
                list.add(i);
            }
        }
        if(list.size() == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(list);
       System.out.println(list.toString());
        int i = 0;
        if(list.get(i) == 0) {
            while (list.get(i) == 0 && i < list.size()) {
                i++;
            }
            list.set(0, list.get(i));
            list.set(i, 0);
        }
        for (int j = 0;j < list.size();j++) {
            result += list.get(j);
        }
        System.out.println(result);
        list.clear();
    }
}
