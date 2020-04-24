package LeetCode;
import java.util.LinkedList;
//给定一个二叉树，确定它是否是一个完全二叉树
public class Soulition6 {

    public boolean isComplete(Sloution5.TreeNode root) {
        LinkedList<Sloution5.TreeNode> q = new LinkedList<>();
        q.add(root);
        Sloution5.TreeNode cur;
        while ((cur = q.removeFirst()) != null) {
            q.addLast(cur.left);
            q.addLast(cur.right);
        }
        while(!q.isEmpty()) {
            if(q.removeLast() == null) {
                return false;
            }
        }
        return true;

    }
}
