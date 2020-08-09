public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
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
    //求二叉树深度
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int left =  maxDepth(root.left) ;
        int right = maxDepth(root.right);
        return 1 + (left > right ? left : right);

    }
    //判断两个树是否相同
    public boolean isSameTree(Node p, Node q) {

        if(p == null && q ==null) {
            return true;
        }
        if(p == null ||q == null){
            return false;
        }
        //p.val == q.val? && p.left == q.left? && p.right == q.right?
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}
