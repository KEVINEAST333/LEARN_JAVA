package ClassTest;

import java.util.Arrays;

public class Sort {
    // 以升序排序为例
    public static void insertSort(int[] array) {
        //已排区间为[0,bound)
        //待排区间为[bound,size]
        for(int bound = 1; bound < array.length;bound++) {
            int cur = bound - 1;
            int tmp = array[bound];
            for(;cur >= 0;cur-- ) {
                if(array[cur] > tmp) {
                    array[cur + 1] = array[cur];
                } else {
                    break;
                }
            }
            //array[cur] 小于 tmp，把tmp加在后面。
            array[cur + 1] = tmp;
        }
    }
    public static void shellSort(int[] array) {
        int gap = array.length;
        while(gap > 1 ) {
            gap = gap / 2;
            insertSortgap(array,gap);
        }
        insertSortgap(array,1);
    }

    private static void insertSortgap(int[] array, int gap) {
        for(int bound = gap;bound < array.length;bound++) {
            int tmp = array[bound];
            int cur = bound - gap;
            for(;cur >= 0;cur -= gap) {
                if(array[cur] > tmp) {
                    array[cur + gap] = array[cur];
                }
                else{
                    break;
                }
            }
            array[cur + gap] = tmp;
        }
    }

    public static void main(String[] args) {
        int [] array = {4,7,2,1,8,0};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
