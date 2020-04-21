package LeetCode;

import TestTree.MyTree;
import TestTree.Node;

import java.util.ArrayList;
import java.util.List;

public class Sloution1 {
    //先序遍历数组
    public static List<Character> preorderTraversal(Node root) {
        List<Character> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        Node root = MyTree.buidTree();
        List<Character> list = preorderTraversal(root);
        System.out.println(list.toString());
    }
}
