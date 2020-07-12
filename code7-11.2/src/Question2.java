
/*已知一支股票连续n天的价格走势，以长度为n的整数数组表示，数
        组中第1个元素(prices[i]) 代表该股票第i天的股价。假设你- 开始没有股票，但
        有至多两次买入1股而后卖出1股的机会，并且买入前一定要先保证手上没有股
        票。
        示。
        若两次交易机会都放弃，收益为0。设计算法， 计算你能获得的最大收益。
        输入数值范围: 2<=n<= 100,0<=prices[i]<=100*/
/*        输入
        3,8,5,1,7,8
        输出
        12*/

public class Question2 {
    public static int getmax(int[] prices, int start, int end) {
        int max = 0;
        int min = prices[start];
        for (int i = start + 1; i <= end; i++) {
            if (prices[i] - min > max)
                max = prices[i] - min;
            if (prices[i] < min)
                min = prices[i];
        }
        return max;
    }

    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public static int calculateMax(int[] prices) {
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            int temp = getmax(prices, 0, i) + getmax(prices, i, prices.length - 1);
            if (temp > result)
                result = temp;
        }
        return result;
    }
}
