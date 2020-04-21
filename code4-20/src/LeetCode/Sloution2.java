package LeetCode;
//判断二叉树是否相同。
public class Sloution2 {
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
