import java.util.ArrayList;


public class printListFromTailToHead {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = reverse(listNode);
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list;
    }

    public static ListNode reverse(ListNode head) {
            ListNode cur = head;
            ListNode prev = null;
            ListNode curNext = null;
            while(cur != null) {
                curNext = cur.next;
                if(curNext == null) {
                    head = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return head;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        System.out.println(printListFromTailToHead(head).toString());
    }
    }

