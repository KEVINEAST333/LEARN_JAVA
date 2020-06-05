import java.util.Stack;
public class Question2 {
    public static void main(String[] args) {
        String s = ")())";
        System.out.println(chkParenthesis(s, s.length()));
    }
    public static boolean chkParenthesis(String A, int n) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(("" + A.charAt(i)).equals("(")) {
                stack.push("" + A.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}