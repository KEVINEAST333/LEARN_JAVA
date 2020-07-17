
/*给定一个数字arr,其中只有有两个数字出现了奇数次,其它数字都出现了偶数次,按照从小到大顺序输出
        这两个数。*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        int a = arrayList.get(0);
        int flag = 0;
        int j = 0;
        while(j < n) {
            while (j < n && a == arrayList.get(j)) {
                flag++;
                j++;
            }
            if(flag % 2 == 1) {
                result.add(arrayList.get(j - 1));
            }
            if(j < n) {
                a = arrayList.get(j);
            }
            flag = 0;
        }
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
