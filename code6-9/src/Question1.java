import java.util.ArrayList;
import java.util.Scanner;
//输入一个整数产生 0 ~ N - 1 个数
//循环删除第三个数 输出最后一个数
//如 0 1 2<D> 3 4 5<D> 6 7
// 0<D> 1 2<D> 3 4 5<D> 6 7
//最后一个只剩下6
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = scanner.nextInt();
        int n = 0;
        int result = 0;
        for(int i = 0 ;i < a;i++) {
            arrayList.add(i);
        }
        while(arrayList.size() != 0) {
            n = (n + 3 - 1) % arrayList.size();
            result = arrayList.get(n);
            arrayList.remove(n);
        }
            System.out.println(result);
        }
    }
}
