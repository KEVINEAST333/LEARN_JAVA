import java.util.*;

/*一个数组有N个元素，求连续子数组的最大和。例如: [-1,2,1], 和最大的连续数组数字之和为
        [2,1]，其和为3*/
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int j = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0 ;i < n;i++) {
            arrayList.add(scanner.nextInt());
        }
        while(j < n) {
            if(((arrayList.get(j) - arrayList.get(j+1)) == 1) ||((arrayList.get(j) - arrayList.get(j+1))== -1)) {
                while (j + 1 < n && (((arrayList.get(j) - arrayList.get(j + 1)) == 1) || ((arrayList.get(j) - arrayList.get(j + 1)) == -1))) {
                    count++;
                    sum += arrayList.get(j);
                    j++;
                }
                map.put(count + 1, sum + arrayList.get(j));
                result.add(count + 1);
            }
            count = 0;
            sum = 0;
            j++;
        }
        Collections.sort(result);
        System.out.println(map.get(result.get(result.size() -1)));
    }
}
