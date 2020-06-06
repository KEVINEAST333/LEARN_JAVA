//用栈实现队列
import java.util.Stack;
public class Question2 {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            push(i);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(pop(j));
        }
    }

    public static int pop(int j) {
        //如果中途加进来先把stack2中出完在入栈防止顺序混乱.
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
        public static void push ( int node){
            stack1.push(node);
        }
}