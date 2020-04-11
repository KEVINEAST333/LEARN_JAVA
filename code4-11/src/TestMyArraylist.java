
import java.util.Arrays;

public class TestMyArraylist {

    private Object[] array = new Object[10];
    private int size;

    public void add(Object o) {
        array[size] = o;
        size++;
    }
    Object get(int index) {
        return  array[index];
    }

//    public TestMyArraylist() {
//        this.array = new Object[10] ;
//        this.size = 0;
//    }

    public static void main(String[] args) {
        TestMyArraylist testMyArraylist = new TestMyArraylist();
        testMyArraylist.add("wang");
        testMyArraylist.add("dong");
        String ret = (String) testMyArraylist.get(0);
        System.out.println(ret);
    }
}