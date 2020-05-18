public class MyHashMap {
    class Node {
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private Node [] array = new Node[101];
    private int size = 0;
    //放入键值对
    public void put(int key,int val) {
        int index  = hashFunc(key);
        Node head = array[index];
        for(Node cur = head;cur != null;cur = cur.next) {
            //哈希表中key相同val不同新的val覆盖掉。
            if(cur.key == key) {
                cur.val = val;
                return;
            }
            //hash冲突new一个新节点连在array[index]里
            Node newNode = new Node(key,val);
            array[index] = newNode;
            newNode.next = head;
            size++;
        }
    }
    //根据键得到值
    private Integer get(int key) {
        int index = hashFunc(key);
        Node cur = array[index];
        while(cur != null) {
            if (cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
    private int hashFunc(int key) {
        return key % array.length;
    }
}
