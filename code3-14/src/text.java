import java.util.Arrays;

public class text {
    public static int[] arry(int [] b) {
        int [] c = new int[b.length];
        for (int i = 0;i < b.length;i++) {
            c[i] = b [i];
        }
        return c ;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
//        int [] ret = arry(a);
        int [] b = new int[5];
//        System.arraycopy(a,1,b,0,4);
        int [] c = Arrays.copyOf(a,4);
        System.out.println(Arrays.toString(c));

    }
}
