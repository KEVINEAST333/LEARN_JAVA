import java.util.Arrays;

public class text {
    public static void main(String[] args) {
        int [] arry =new int[] {1,3,4,6,7,2};
        int n = 5;
        /*System.out.println(Arrays.binarySearch(arry,5));
        int ret = binarySearch(arry,n);
        System.out.println(ret);*/
//        bubbleSort (arry);
        reverse(arry);
        System.out.println(Arrays.toString(arry));
    }
    public static int binarySearch (int [] a,int find) {
        int left = 0;
        int right = (a.length-1);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] > find) {
                right = mid - 1;
            }
            else if (a[mid] < find) {
                left = mid + 1;
            }
            else {
                return mid;
            }

        }
        return - 1;
    }// 二分查找中位数
    public static void bubbleSort (int [] a) {
        for (int i = 0;i < a.length -1;i++){
            for (int j = 0;j < a.length -1;j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }// 冒泡排序
    public static void reverse (int [] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int tmp = a [left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
    }//逆序数组
}
