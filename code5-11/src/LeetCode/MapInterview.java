package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MapInterview {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while (cur != null) {
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        //方法一
       /* for(Node cur2 = head; cur != null;cur2 = cur2.next) {
            Node newNode = map.get(cur2);
            newNode.next = map.get(cur2.next);
            newNode.random = map.get(cur2.random);
        }*/
       //方法二
        for(Map.Entry<Node,Node> entry: map.entrySet()) {
            entry.getValue().next = map.get(entry.getKey().next);
            entry.getValue().random = map.get(entry.getKey().random);
        }
        return map.get(head);
    }
}
