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

    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        return false;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {

    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }

    //得到单链表的长度
    public int size() {
        return -1;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public void clear() {
    }
}
