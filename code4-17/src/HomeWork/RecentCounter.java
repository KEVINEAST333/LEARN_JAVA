package HomeWork;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        queue.offer(t);
        return queue.size();


    }
}
