class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoubleLinkedList {
    public Node head;
    public Node last;
    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node cur = this.head;
        if(index < 0 || index > size()) {
            System.out.println("非法输入");
        }
        else if(index == 0) {
            addFirst(data);
        }
        else if(index == size()) {
            addLast(data);
        }
        else {
            for(int i = 0;i < index;i++) {
                cur = cur.next;
            }
            Node node = new Node(data);
            cur.prev.next = node;
            node.prev = cur.prev;
            node.next = cur;
            cur.prev = node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if (cur == this.last) {
                    this.last = cur.prev;
                    cur.prev.next = null;
                } else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return ;
            }else {
                cur = cur.next;
            }
        }

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if (cur == this.last) {
                    this.last = cur.prev;
                    cur.prev.next = null;
                } else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
                cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void clear() {
        this.head = null;
        this.last = null;
    }

}
