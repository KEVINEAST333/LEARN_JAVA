package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

//查找和最小的K对数字。
//TOP K 问题用优先队列。
/*输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
        输出: [1,2],[1,4],[1,6]
        解释: 返回序列中的前 3 对数：
        [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]*/
public class Sloution {
        class pair {
            public int num1;
            public int num2;
            public int sum;

            public pair(int num1, int num2) {
                this.num1 = num1;
                this.num2 = num2;
                this.sum = num1 + num2;
            }
        }
        /*class Compapre implements Comparator<pair> {
            @Override
            public int compare(pair o1, pair o2) {
                return o1.sum - o2.sum;
            }
        }*/
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<List<Integer>> result= new ArrayList<>();
            if(k <= 0) {
                return result;
            }
            //Compapre compapre = new Compapre();
            PriorityQueue<pair> queue = new PriorityQueue<>(new Comparator<pair>() {
                @Override
                public int compare(pair o1, pair o2) {
                    return o1.sum - o2.sum;
                }
            });
            for(int i = 0;i < nums1.length;i++) {
                for(int j = 0;j < nums2.length;j++) {
                    queue.offer(new pair(nums1[i],nums2[j]));
                }
            }
            for(; k > 0 && !queue.isEmpty() ;k--) {
                pair pair2 = queue.poll();
                List<Integer> list = new ArrayList<>();
                list.add(pair2.num1);
                list.add(pair2.num2);
                result.add(list);
            }
            return result;
        }
}
