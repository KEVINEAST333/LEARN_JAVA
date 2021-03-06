package TestTree;

import LeetCode.TreeNode;

import javax.swing.*;
import java.util.*;

public class MyTree {
    public static Node buidTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = G;
        C.right = F;
        return A;
    }
    //先序遍历二叉树
    public static void firstOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " -> ");
        firstOrder(node.left);
        firstOrder(node.right);
    }
    //层序遍历
    public static void Order(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()) {
            System.out.print(queue.peek().val + " ");
            node = queue.poll();
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
    }
    //求二叉树的结点个数—静态变量简单方法
    public static int size = 0;
    public static void getSize1(Node root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }
    //求二叉树的结点个数-返回值的方式
    public static int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + getSize2(root.left) + getSize2(root.right);
    }
    //求二叉树叶子节点个数
    public static int leafSize(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.left == null) {
            return 1;
        }
        return leafSize(root.left) + leafSize(root.right);
    }
    //求K层的结点个数。
    public static int kLevelSize(Node root, int k) {
        if(root == null || k < 1) {
            return 0;
        }
        if(k == 1){
            return 1;
        }
       return kLevelSize(root.left, k -1) + kLevelSize(root.right, k -1);
    }
    //遍历二叉树找元素
    public static Node find(Node root, char toFind) {
        if(root == null) {
            return null;
        }
        if(root.val == toFind) {
            return root;
        }
        Node result = find(root.left,  toFind);
        if(result != null) {
            return result;
        }
        return find(root.right, toFind);
    }
    //队列求二叉树深度
    public static int maxDepth1(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int preCount = 1;
        int pCount = 0;

        int level = 0;

        while (!q.isEmpty()) {
            Node temp = q.poll();
            preCount--;

            if (temp.left != null) {
                q.offer(temp.left);
                pCount++;
            }
            if (temp.right != null) {
                q.offer(temp.right);
                pCount++;
            }

            if (preCount == 0) {
                preCount = pCount;
                pCount = 0;
                // System.out.println();
                level++;
            }
        }
        return level;
    }
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        // bfs
        Queue<Node> queue = new LinkedList<>();
        int depth = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return depth;
    }
    //循环后序遍历二叉树
    public static void postOrder(Node root) {
        if(root == null) {
            return ;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root.left;
        Node prev = null;
        stack.push(root);
        while(!stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
//            if(stack.isEmpty()) {
//                break;
//            }
            Node top = stack.peek();
            if(top.right == null || top.right == prev) {
                System.out.print(top.val + " ");
                prev = stack.pop();
            }
            else {
                cur = top.right;
            }

        }
    }
    public static void main(String[] args) {
        Node root = buidTree();
        //firstOrder(root);
       // Order(root);
//        getSize1(root);
//        System.out.println(size);
        //System.out.println(getSize2(root));
//        System.out.println(leafSize(root));
//        System.out.println(kLevelSize(root, 4));
       // Node result = find(root, 'G');
      //  System.out.println(result);
        //int high = maxDepth(root);
        //System.out.println(high);
        postOrder(root);
    }
}
