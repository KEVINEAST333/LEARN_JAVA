package LeetCode;
import java.util.Comparator;
import java.util.PriorityQueue;
//最后一块石头的重量
/*输入：[2,7,4,1,8,1]
        输出：1
        解释：
        先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
        再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
        接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
        最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。*/
public class Sloution2 {
    public static int lastStoneWeight(int[] stones) {
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0;i < stones.length;i++) {
            queue.offer(stones[i]);
        }
        while(queue.size() != 1) {
            int a = queue.poll();
            int b = queue.poll();
            if(a != b) {
                queue.offer(a - b);
            }
        }
        if(queue.isEmpty()) {
            result = 0;
            return result;
        }
        result = queue.peek();
        return result;
    }

    public static void main(String[] args) {
        int [] array = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(array));
    }
}
