//根据先序中序构造二叉树

public class reConstructBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        int index = 0;
        public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            TreeNode root = buidTree(pre, in, 0, in.length);
            return root;
        }

        public TreeNode buidTree(int[] pre, int[] in, int left, int right) {
            if (left >= right) {
                return null;
            }
            if (index >= pre.length) {
                return null;
            }
            int post = findN(pre, in, index);
            TreeNode node = new TreeNode(pre[index]);
            index++;
            //核心
            node.left = buidTree(pre, in, left, post);
            node.right = buidTree(pre, in, post + 1, right);
            return node;
        }

        public int findN(int[] pre, int[] in, int index) {
            for (int i = 0; i < pre.length; i++) {
                if (pre[index] == in[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}
