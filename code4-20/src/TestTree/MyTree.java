package TestTree;

import javax.swing.*;

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
    public static void main(String[] args) {
        Node root = buidTree();
        firstOrder(root);
//        getSize1(root);
//        System.out.println(size);
        System.out.println(getSize2(root));
//        System.out.println(leafSize(root));
//        System.out.println(kLevelSize(root, 4));
        Node result = find(root, 'G');
        System.out.println(result);
    }
}
