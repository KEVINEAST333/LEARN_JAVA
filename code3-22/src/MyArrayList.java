public class MyArrayList {
    public int[] elem;//null
    public int usedSize;//0
    //设置默认容量
    public static final int DEFAULT_SIZE = 10;
    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;

    }
    public boolean isFull () {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    public void add(int pos,int data) {
        if (isFull()) {
            System.out.println("满的");
            return;
        }
        int i = this.usedSize-1;
        while(i >= pos) {
            this.elem[i +1] = this.elem[i];
                    i--;
        }
        this.elem[pos] = data;
        this.usedSize++;

    }
    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i =0;i <usedSize;i++) {
            if(toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }
//查找某个元素对应的位置
        public int search(int toFind) {
            for(int i =0;i <usedSize;i++) {
                if(toFind == this.elem[i]) {
                    return i;
                }
            }
             return -1;
        }
//获取pos位置的元素
         public int getPos(int pos){
        return this.elem[pos] ;
    }
    public void remove(int key){
        int a = this.search(key);
        if(a == -1) {
            return ;
        }
        else {
            for (int i = a; i < this.usedSize-1; i++) {
                this.elem[i] = this.elem[i + 1];
            }
            this.usedSize--;
        }
    }
         public void show() {
        for(int i = 0;i < usedSize;i++) {
            System.out.println(this.elem[i]);
        }
    }   
}