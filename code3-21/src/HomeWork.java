import java.util.Arrays;

public class HomeWork {
    /*static int a = 6;
    static {
        a += 9;
    }*/
  /*  public String toString() {
        System.out.print("aaa");
        return "bbb";
    }*/
    public static void sortArray(int[] array) {
        int right = array.length - 1;
        int left = 0;
        int tmp = 0;
        while(left < right) {
            if (left < right && array[left] % 2 == 0) {
                left++;
            }
            if (left < right && array[right] % 2 == 1) {
                right--;
            }
            tmp = array[left];
            array[left] = array [right];
            array [right] = tmp;
        }
    }
    public static void excArray(int[] array,int[] array2) {
        int[] array3 = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            array3[i] = array[i];
            array[i] = array2[i];
            array2[i] = array3[i];
        }
    }
    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(new HomeWork());
        int [] arr = new int[] {1,2,3,4,5,6,7,8};
        int [] arr2 = new int[] {1,1,1,1,1,1,1,1};
//        sortArray(arr);
//        System.out.println(Arrays.toString(arr));
        excArray(arr,arr2);
        System.out.println(Arrays.toString(arr2));
    }
    /*static {
        a /= 3;
    }*/
}
