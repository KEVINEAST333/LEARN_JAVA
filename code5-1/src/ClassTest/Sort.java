package ClassTest;

import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;

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
    //堆排序
    private static void heapSort(int [] array) {
        creatHeap(array);
        int heapSize = array.length;
        for(int i = 0;i < array.length - 1;i++) {
            swap(array,0,heapSize - 1);
            heapSize--;
            shiftDown(array,heapSize,0);
        }
    }

    private static void creatHeap(int[] arr) {
        for(int i = (arr.length - 1 - 1)/2;i >= 0;i--) {
            shiftDown(arr,arr.length,i);
        }
    }
    private static void shiftDown(int[] arr, int size, int index) {
        int parent = index;
        int child = parent * 2 + 1;
        while(child < size) {
            if((child + 1 < size) && (arr[child + 1] > arr[child])) {
                child = child + 1;
            }
            if(arr[child] > arr[parent]) {
                swap(arr,child,parent);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    //快速排序（递归实现）
    private static void quickSort(int [] array) {
        quickSorthelper(array,0,array.length -1);
    }

    private static void quickSorthelper(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int index = partition(array,left,right);
        quickSorthelper(array,left,index - 1);
        quickSorthelper(array,index + 1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int baseVaule = array[right];
        int i = left;
        int j = right ;
        while(i < j) {
            while (i < j && array[i] <= baseVaule) {
                i++;
            }
            while (i < j && array[j] >= baseVaule) {
                j--;
            }
            if(i < j) {
                swap(array, i, j);
            }
        }
        swap(array,i,right);
        return i;
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
       //selectSort(array);
        //creatHeap(array);
        //heapSort(array);
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
