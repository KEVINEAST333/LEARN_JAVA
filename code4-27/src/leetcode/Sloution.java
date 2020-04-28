package leetcode;

import java.util.ArrayList;
import java.util.List;
//二叉树最大宽度
/*输入:

        1
        /   \
        3     2
        / \     \
        5   3     9

        输出: 4
        解释: 最大值出现在树的第 3 层，宽度为 4 (5,3,null,9)。*/
public class Sloution {
        int max;
        public int widthOfBinaryTree(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            dfs(root ,1,1,list);
            return max;
        }
        public void dfs(TreeNode root,int level, int index ,List<Integer> list) {
            if(root == null) {
                return;
            }
            if(level > list.size()) {
                list.add(index);
            }
            max = Math.max(max,index - list.get(level -1) + 1) ;
            dfs( root.left,level + 1,  index * 2 , list);
            dfs( root.right,level + 1, index * 2 + 1 ,list);

    }
    public static TreeNode buildTree() {
        TreeNode A1 = new TreeNode(1);
        TreeNode B2 = new TreeNode(2);
        TreeNode C3 = new TreeNode(3);
        A1.right = B2;
        B2.right = C3;
        return A1;
    }
    public static void main(String[] args) {
        TreeNode head = buildTree();
        System.out.println();
    }
}
