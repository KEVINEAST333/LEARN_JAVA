package ClassTest;

import java.util.Arrays;

public class Sort {
    // 以升序排序为例
    //插入排序
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
    //希尔排序。
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
    //冒泡排序。
    private static void bubbleSort(int [] array) {
        for(int bound = 0;bound < array.length ;bound++) {
            for(int cur = 0;cur < array.length - 1 - bound;cur++) {
                if(array[cur] > array[cur + 1]) {
                    swap(array,cur,cur + 1);
                }
            }
        }
    }
    //选择排序
    private static void selectSort(int [] array) {
        for(int bound = 0;bound < array.length;bound++) {
            for(int cur = bound;cur < array.length;cur++) {
                if(array[cur] < array[bound]) {
                    swap(array,cur,bound);
                }
            }
        }
    }
    //交换方法
    private static void swap(int [] arr,int i,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int [] array = {9,5,2,7,3,6,8};
        //shellSort(array);
        //bubbleSort(array);
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
