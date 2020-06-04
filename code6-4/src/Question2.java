import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {

    }
    public boolean chkParenthesis(String A, int n) {
        int length  = A.length();
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0;i <length;i++) {
            queue.offer("" + A.charAt(i));
            stack.push("" + A.charAt(i));
        }
    }
}
