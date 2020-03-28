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
}

