package LeetCode;
/*给你一个树，请你 按中序遍历 重新排列树，
 使树中最左边的结点现在是树的根，
 并且每个结点没有左子结点，
 只有一个右子结点。
 */
public class Sloution5 {
    TreeNode cur = null;
    TreeNode head = null;
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
          val = x;
      }
  }
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) {
            return null;
        }
        increasingBST(root.left);
        bulidTree(root.val);
        increasingBST(root.right);
        return head;
    }
    public void bulidTree(int val) {

                if(head == null) {
            TreeNode treeNode = new TreeNode(val);
            head = treeNode;
            cur = head;
            return ;
        }
        TreeNode treeNode = new TreeNode(val);
        cur.left = null;
        cur.right = treeNode;
        cur = cur.right;

    }
}
