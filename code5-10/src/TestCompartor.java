import java.util.Comparator;
import java.util.PriorityQueue;

public class TestCompartor {
    public static void main(String[] args) {
        //匿名内部类
        /*PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/
        class myCompar implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new myCompar());
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
    }
