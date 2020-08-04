import java.util.ArrayList;
import java.util.Arrays;

public class Sloution2 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input.length <= 0 || k <= 0) {
            return list;
        }
        if (input.length < k) {
            return list;
        }
        //利用排序算法先对数组进行排序
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j + 1] < input[j]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for (int m = 0; m < k; m++) {
            list.add(input[m]);
        }
        return list;

    }
}
