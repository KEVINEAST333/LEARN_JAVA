/*有个小孩正在上楼梯，楼梯有n阶台阶，小孩- -次可以上1阶、2阶、3阶。请实现
        一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod
        1000000007
        给定一个正整数int n,请返回一个数，代表上楼的方式数。保证n小于等于
        100000。*/

import java.util.Scanner;

public class Question2 {
    private static final int mod = 1000000007;
        public int countWays(int n) {
            if(n < 3) {
                return n;
            }
         long [] dp = new long[n + 1];
         dp[0] = 0;
         dp[1] = 1;
         dp[2] = 2;
         dp[3] = 4;
         for(int i = 4; i <= n; i++) {
             dp[i] = (dp[i - 1] % mod + dp[i -2] % mod + dp[i - 3] % mod) % mod;
         }
         return (int)dp[n];
        }
    public static void main(String[] args) {

    }
}
