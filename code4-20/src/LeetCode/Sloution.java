package LeetCode;

import java.util.Stack;
//循环遍历二叉树
public class Sloution {
    //循环先序遍历
    public void firstOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack <TreeNode>stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            TreeNode tmp = stack.pop();
            if(tmp.right != null) {
                stack.push(tmp.right);
            }
           if(tmp.left != null) {
               stack.push(tmp.left);
           }
        }
    }
    //循环后序遍历
    public void postOrder(TreeNode root) {
        if(root == null) {
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while(true) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            if(cur.right == null || cur.right == prev) {
                System.out.println(stack.peek());
                prev = stack.pop();
                cur = stack.peek();
            }
            else {
                cur = cur.right;
            }

        }
    }
    //循环中序遍历二叉树
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack =new Stack<>();
        TreeNode cur = root;
        while(true) {
            while(cur != null) {
                cur = cur.left;
            }
            if(stack.isEmpty()) {
                break;
            }
            TreeNode top = stack.peek();
            System.out.println(top.val);
            stack.pop();
            cur = top.right;
        }
    }
}
