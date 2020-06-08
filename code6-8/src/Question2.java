
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Question2 {
    //输入一串数字用空格隔开 找出出现次数大于n / 2输出
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            for(int i = 0;i < strings.length ;i++) {
                arrayList.add(Integer.valueOf(strings[i]));
            }
            Collections.sort(arrayList);
            if(arrayList.size() % 2 == 0) {
                System.out.println(arrayList.get(arrayList.size()/2 -1));
            } else {
                System.out.println(arrayList.get(arrayList.size()/2 ));
            }

        }

    }
}
