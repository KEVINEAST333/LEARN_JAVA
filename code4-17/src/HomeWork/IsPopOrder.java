package HomeWork;

import java.util.Stack;

public class IsPopOrder {
    public static boolean IsPopOrder2(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0;i < pushA.length;i++) {
                stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
        }
        }

            if(stack.empty()) {
                return true;
            }
            return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = {4,5,3,2,1};
        Boolean a = IsPopOrder2(array, array2);
        System.out.println(a);
    }

}
