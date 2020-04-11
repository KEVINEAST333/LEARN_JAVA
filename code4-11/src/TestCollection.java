
import java.lang.reflect.Array;
import java.util.*;

class MyArraylist<E> {
    private E[] array= (E[]) new Object[10] ;
    private int size;

    public void add(E e) {
        array[size] = e;
        size++;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyArraylist{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}


public class TestCollection {

    public static void main(String[] args) {
//        Collection<String> connection = new ArrayList<>();
//        connection.add("我");
//        connection.add("爱");
//        connection.add("你");
//        for(String s : connection ) {
//            System.out.println(s);
//        }
//        Map<String,String> map =new HashMap<>();
//        map.put("赤赤","王赫");
//        map.put("大干","文强");
//        map.put("驴驴","訾信誉");
//        System.out.println(map.get("赤赤"));
//        map.remove("赤赤");
//        System.out.println(map.toString());
//
//
//        ArrayList <String> arrayList = new ArrayList<>();
//        arrayList.add("SSSS");
        MyArraylist myArraylist = new MyArraylist();
       // myArraylist.setSize(5);
        myArraylist.add("w");
        myArraylist.add("a");
        myArraylist.add("n");
        myArraylist.add("g");
       // System.out.println(myArraylist.getSize());
        System.out.println(myArraylist.toString());
        Collection<Integer> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List list1 = new ArrayList();
    }
}
