package Test;

import java.util.Comparator;
import java.util.PriorityQueue;
public class TestPriorityQueue {
    public static class MyComp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            // 大家不要去硬背这个规则, 很拗口, 记不住!!!
//            // 先随便写一种, 测试一下, 看结果对不对. 如果不对, 改一下就行了~~
//            // return o2 - o1;
//            return o1 - o2;
//        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new MyComp());
        queue.offer(8);
        queue.offer(15);
        queue.offer(3);
        queue.offer(1);
        queue.offer(5);
        queue.offer(4);
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
