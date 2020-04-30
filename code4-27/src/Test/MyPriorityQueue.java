package Test;

public class MyPriorityQueue {
    private int[] array = new int[100]; // 暂时不考虑扩容
    private int size = 0;   // [0, size) 表示有效元素区间.
    //增加元素offer方法
    public void offer(int x) {
        array[size] = x;
        size++;
        shiftUp(array,size,size - 1);
    }
    //向上调整shiftUp方法
    private void shiftUp(int[] array, int size, int index) {
        int child = index;
        int parent = (child - 1) / 2;
        while(parent >= 0) {
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }
            else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }
    //向下调整shiftDown方法
    private void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size) {
            if(array[child + 1] > array[child]) {
                child = child + 1;
            }
            if(array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }
            else {
                break;
            }
            parent = child;
            child = parent * 2 + 1;
        }
    }
    //出队列poll方法
    public Integer poll() {
        if(size == 0) {
            return null;
        }
        int tmp = array[0];
        array[0] = array[size -1] ;
        size --;
        shiftDown(array,size,0);
        return tmp;
    }
    //取队首元素peek方法
    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return array[0];
    }
    //判空isEmpty方法
    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(4);
        queue.offer(7);
        queue.offer(18);
        queue.offer(15);
        queue.offer(8);
        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            System.out.println(cur);
        }
    }
}
