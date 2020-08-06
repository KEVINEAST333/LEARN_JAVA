
public class removeElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    //删除单链表重复的节点
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        //头结点为空返回
        if(head == null) {
            return null;
        }
        //头结点为空向后遍历更新头节点
        if(head.val == val) {
            head = head.next;
        }
        ListNode cur = prev.next;
        while (cur != null) {
            //删除一个cur移动prev不移动
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }
            else {
                prev = prev.next;
                cur = cur.next;
            }
            if(head.val == val) {
                head = head.next;
            }
        }
        return head;
    }
}
