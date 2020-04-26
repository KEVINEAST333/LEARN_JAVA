package LeetCode;

import java.util.Stack;
//循环遍历二叉树
public class Sloution {
    public void firstOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack <TreeNode>stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            TreeNode tmp = stack.pop();
            stack.push(tmp.right);
            stack.push(tmp.left);
        }
    }
}
