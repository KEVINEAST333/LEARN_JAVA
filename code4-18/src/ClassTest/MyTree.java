package ClassTest;

public class MyTree {
    //自己创建一个树
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
        C.right = F;
        E.left = G;
        return A;
    }
    //遍历整个树打印
    public static void prevOrder(Node node) {
           //先序
        /* if (node == null) {
                return;
            }
            System.out.print(node.val + " -> ");
            prevOrder(node.left);
            prevOrder(node.right);*/
        //中序
        /*if (node == null) {
            return;
        }
        prevOrder(node.left);
        System.out.print(node.val + " -> ");
        prevOrder(node.right);*/
        //倒叙
        if (node == null) {
            return;
        }
        prevOrder(node.left);
        prevOrder(node.right);
        System.out.print(node.val + " -> ");
    }
    public static void main(String[] args) {
        Node head = buidTree();
        prevOrder(head);
        System.out.print("over ");

    }
}
