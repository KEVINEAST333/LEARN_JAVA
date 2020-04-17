package HomeWork;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Stack;

//根据逆波兰表示法，求表达式的值
/*输入: ["2", "1", "+", "3", "*"]
        输出: 9
        解释: ((2 + 1) * 3) = 9*/
public class Sloution2 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a = 0;
        int b = 0;
        for(String s:tokens) {
            switch (s) {
                case "+" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;
                case "*" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                case "/" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                case "-" :
                   a = stack.pop();
                   b = stack.pop();
                    stack.push(b - a);
                    break;

                default:
                    stack.push(Integer.valueOf(s));
                break;
            }
        }
        return stack.peek();

    }

    public static void main(String[] args) {

    }
}
