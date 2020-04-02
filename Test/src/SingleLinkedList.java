class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    public Node head;

    //构造方法
    public SingleLinkedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        int end = size() -1;
        if(index == 0) {
            addFirst(data);
        }
        if(index == end) {
            addLast(data);
        }
        if (index > 0 && index < end) {
            Node prev = this.head;
            Node cur = prev.next;
            int count = 0;
            while (cur != null) {
                count++;
                if (count == index ) {
                    Node node = new Node(data);
                    prev.next = node;
                    node.next = cur;
                }
                cur = cur.next;
                prev = prev.next;
            }
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node prve = this.head;
        Node cur = prve.next;
        if(this.head.data == key) {
            this.head = prve.next;
        }
        else {
            while (cur != null) {
                if (cur.data == key) {
                    prve.next = cur.next;
                    return;
                }
                cur = cur.next;
                prve = prve.next;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        if(this.head.data == key) {
            this.head = this.head.next;
        }
        Node cur = prev.next;
        while(cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
            if(this.head.data == key) {
                this.head = this.head.next;
            }
        }
    }
    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
// 打印
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    //全部删除链表
    public void clear() {
        //this.head = null;
        Node cur = this.head.next;
        while(cur != null) {
            this.head.next = cur.next;
            cur = cur.next;
        }
        this.head = null;
    }
    // 反转链表
    public void reverseList() {
        Node prev = null;
        Node cur = this.head;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                this.head = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点
    public void deleteDuplication() {
        Node cur = this.head;
        Node node = new Node(-1);
        Node tmp = node;

        while (cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while(cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }
            else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        this.head = node.next;

    }
    //返回链表的中间结点。
    public void middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = null;
        this.head = slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public void FindKthToTail(int k) {
        Node slow = this.head;
        Node fast = this.head;
        if(k < 1 || k > size()) {
            return;
        }
        for(int i = 0;i < k - 1;i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = null;
        this.head = slow;

    }
    public void cycle() {
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null && fast.next == null) {
            return null;
        }
        slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
    }
        this.head = slow;
        slow.next = null;
        return slow;

    }
    //是否是链表环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
            return false;
    }
    //输入两个链表，找出它们的第一个公共结点
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;

        Node pL = headA;//代表长的单链表
        Node pS = headB;//代表短的单链表

        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        //如果不指回来 那么pl和ps是空
        pL = headA;
        pS = headB;

        int len = lenA-lenB;
        if (len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }
        //可以保证：
        // 1、pL指向了长的单链表   pS指向了短的单链表
        //2、len的值 是一个正数
        while (len  > 0) {
            pL = pL.next;
            len--;
        }
        //pL 走了差值len步
        while (pL != pS) {
            pS = pS.next;
            pL = pL.next;
        }
        //pL == pS
        if(pL==pS  && pL != null){
            return pL;
        }
        return null;
    }
    //创建一个交叉链表；
    public void crossLinkedlist(Node head , Node head2) {
        while ( head.next != null) {
            head = head.next;
        }
        head.next = head2.next.next;
    }
    //链表的回文结构
    public boolean chkPalindrome() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null&&fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = this.head;
        Node cur = slow;
        Node prev = slow;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        cur = prev;
        while(fast != slow ) {
            if(fast.data != cur.data) {
                return false;
            }
            fast = fast.next;
            cur = cur.next;
        }
        return  true;
    }
    //合并链表
    public void mergeList(Node head1,Node head2) {
        Node cur = head1;
        while(cur.next!= null) {
            cur = cur.next;
        }
        cur.next = head2;
    }
}

