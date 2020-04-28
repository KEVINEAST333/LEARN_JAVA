package Test;

import java.util.Arrays;

public class Heep {
    public static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size) {
            if(array[child] < array[child +1]) {
                child = child + 1;
            }
            if(array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }
            else{
                break;
            }
            parent = child;
            child = parent * 2 + 1;
        }
    }
    public static void createHeap(int[] array, int size) {
        for(int i = (array.length -1-1)/2;i >= 0;i--) {
            shiftDown( array,  size,  i);
        }

    }

    public static void main(String[] args) {
        int [] array = {16,4,15,3,1,17,1};
        //shiftDown(array,array.length,0);
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));
    }
}
