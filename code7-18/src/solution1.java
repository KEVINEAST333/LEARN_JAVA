
/*
算法时间复杂度O（n）
用total记录累计值，maxSum记录和最大
基于思想：对于一个数A，若是A的左边累计数非负，那么加上A能使得值不小于A，认为累计值对
          整体和是有贡献的。如果前几项累计值负数，则认为有害于总和，total记录当前值。
此时 若和大于maxSum 则用maxSum记录下来
*/
/*[1,-2,3,10,-4,7,2,-5]*/
import java.util.Scanner;
public class solution1 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0)
            return 0;
        else{
            int total = array[0],maxSum = array[0];
            for(int i = 1;i < array.length;i++){
                if(total >= 0) {
                    total += array[i];
                }
                else {
                    total = array[i];
                }
                if(total > maxSum) {
                    maxSum = total;
                }
            }
            return maxSum;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++) {
            array[i] = scanner.nextInt();
        }
        int result = FindGreatestSumOfSubArray(array);
        System.out.println(result);
    }
}
