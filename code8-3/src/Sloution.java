import javax.xml.transform.Result;
import java.util.ArrayList;

public class Sloution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(input.length <= 0|| k<= 0){
            return result;
        }
        if(input.length < k){
            return result;
        }
        for(int i = 0; i < input.length ;i++) {
            for (int j = 0;j < input.length - i -1;j++) {
                if(input[j] > input[j + 1]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }

            }
        }

        for (int n = 0; n < k;n++) {
            result.add(input[n]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] s = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(s, 4).toString());
    }
}
