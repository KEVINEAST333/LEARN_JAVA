import java.util.Arrays;

public class HomeWork {
    public static void isIncrease(int[] array) {
        Boolean flag = true;
        for(int i = 0;i < array.length-1;i++) {
            if (array[i+1] < array[i]) {
                flag = false;
                break;
            }
        }
        if(flag == true) {
            System.out.println("该数组为递增数组");
        }
        else
        System.out.println("该数组不为递增数组");
    }
    public static int findKey(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        int mid = (left + right)/2;
        while(left <= right) {
            mid = (left + right)/2;
            if (key > array[mid]) {
                left = mid + 1;
            }
            else if(key < array[mid]) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int[] arrCopof(int[] array) {
        int[] array2 = new int[array.length];
        for(int i = 0;i < array.length-1;i++) {
            array2[i] = array[i];
        }
        return array2;
    }
    public static void toString(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }

        System.out.print("]");
    }
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};
//        int [] arr2 = new int[] {1,2,5,4,6,3};
////        isIncrease(arr);
//        int key = 5;
//        int ret = findKey(arr,key);
//        System.out.println(ret);
        //给定一个有序整型数组, 实现二分查找
//        int[] b = arrCopof(arr);
//        System.out.println(Arrays.toString(b));
        toString(arr);

    }
}
