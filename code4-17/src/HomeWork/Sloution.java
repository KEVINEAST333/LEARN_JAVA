package HomeWork;

import java.util.Stack;

//比较含退格的字符串
/*输入：S = "ab#c", T = "ad#c"
        输出：true
        解释：S 和 T 都会变成 “ac”*/
public class Sloution {
    public static String  push(String S ) {
        Stack <Character>stack1 = new Stack<>();
        for(int i = 0;i < S.length();i++) {
            if (S.charAt(i) != '#') {
                stack1.push(S.charAt(i));
            }
            else {
                if(!stack1.empty()) {
                    stack1.pop();
                }
            }
        }
        return String.valueOf(stack1);

    }
    public static boolean  backspaceCompare(String S, String T) {
        Boolean b = push(S).equals(push(T));
        return b;
    }


    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ab#c";
        boolean a = backspaceCompare(s, t);
        System.out.println(a);
    }
}
