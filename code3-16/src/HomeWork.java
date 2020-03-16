import javax.xml.crypto.dsig.Transform;
import java.util.Arrays;
public class HomeWork {
    public static double avg(int [] array) {
        int n = array.length;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum/n;
    }
    public static int sumArr(int [] array) {
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void transform(int [] array) {
        for(int i = 0;i < array.length;i++) {
            array[i] *= 2;
        }
    }
    public static void printArray(int [] array) {
        for(int i:array) {
            System.out.print(i + " ");
        }
    }
    public static void changeArr(int [] array) {
        for(int i = 0;i < array.length;i++) {
            array[i] = i + 1;
        }
    }
    public static void BubbleSort(int [] array) {
        Boolean flag = false;
        for(int i = 0;i < array.length-1;i++) {
            flag = false;
            for(int j = 0;j < array.length-1-i;j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }

            }
            if(flag == false) {
                    return;
                }
        }
    }
    public static void main(String[] args) {
//        int [] arr = new int[]  {1,2,3,4,5};
//        System.out.println(avg(arr));
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值

//        System.out.println(sumArr(arr));
        //sumArr, 以数组为参数, 求数组所有元素之和

//        transform(arr);
//        System.out.println(Arrays.toString(arr));
        //方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2

//        printArray(arr);
        //方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
        /*int [] arr = new int[100];
        changeArr(arr);
        for(int i:arr) {
            System.out.print(i + " ");
        }*/
        //一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int [] arr = {1,3,2,8,4,6,5,7,10,9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        //给定一个整型数组, 实现冒泡排序(升序排序)
    }
}
