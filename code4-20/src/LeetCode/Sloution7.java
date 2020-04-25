package LeetCode;

public class Sloution7 {
    public  static int index = 0;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return biuldTreeHelper(preorder,inorder,0,preorder.length);
    }

    public static TreeNode biuldTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if(left >= right) {
            return null;
        }
        if(index >= preorder.length) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[index]);
        int pos = find(preorder,inorder,index);
        index++;
        treeNode.left = biuldTreeHelper( preorder, inorder, left, pos);
        treeNode.right = biuldTreeHelper( preorder, inorder, pos+1, right);
        return treeNode;
    }
    public static int find(int [] preorder,int [] inorder, int index) {
        for(int i = 0; i < inorder.length; i ++) {
            if(preorder[index] == inorder[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] preorder = {-1};
        int [] order = {-1};
        System.out.println(buildTree(preorder, order).val);

    }
}
