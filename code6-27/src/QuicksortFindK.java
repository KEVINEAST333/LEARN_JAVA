import java.util.Arrays;

//快排找第K大的数
public class QuicksortFindK {
    public static int findKth(int[] a, int n, int K) {
        quickSort(a,0,a.length -1);
        return a[n - K];
    }
    public static void quickSort(int[] array,int left ,int right ) {
        if(left >= right) {
            return;
        }
        int benchMark = array[right];
        int i = left;
        int j = right;
        while (i < j) {
            while(i < j && array[i] <= benchMark) {
                i++;
            }
            while(i < j && array[j] >= benchMark) {
                j--;
            }
            if(i < j) {
                swp(array, i, j);
            }
        }
        swp(array,i, right);
        int index = i;
        quickSort(array,left,index - 1);
        quickSort(array,index + 1,right);

    }

    private static void swp(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int [] array = {1,3,2,0,7,9,8};
       quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
       int ret = findKth(array,array.length,3);
        System.out.println(ret);
    }
}
