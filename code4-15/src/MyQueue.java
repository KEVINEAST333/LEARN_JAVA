public class MyQueue {
   Node head = new Node(-1);
   Node tail = head;
    // 入队列(链表尾插)
    public void offer(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = tail.next;
    }
    // 取队首元素
    public Integer peek() {
        if (head.next == null) {
            return  null;
        }
        return head.next.val;
    }
    // 出队列(链表头删)
    public Integer poll() {
        if (head.next == null) {
            return null;
        }
        Node toDelete = head.next;
        head.next = toDelete.next;
        if(head.next == null) {
            tail = head;
        }
        return toDelete.val;
    }
    public void show() {
        Node cur = head.next;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

}
