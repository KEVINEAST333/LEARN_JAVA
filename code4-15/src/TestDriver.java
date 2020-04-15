import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TestDriver {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
        myQueue.offer(myQueue.poll());
        myQueue.show();
    }
}
