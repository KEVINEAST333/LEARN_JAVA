
public class ReverseLinkedList {
    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    //逆序单链表
    public Node reverseList(Node head) {
        Node prev = null;
        Node cur = head;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                head = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return head;
    }

}
