public class Question2 {
    /* 对于 x 行 y 列的矩阵  走空格
    机器人在X*Y的矩阵中走，每一步都有两种选择：要么向下、要么向右。
    如果向下走，问题就变成：求(X-1)*Y矩阵中机器人的走法；
    如果向右走，问题就变成：求X*(Y-1)矩阵中机器人的走法；
    显然是递归的思想！
    既然是递归，再考虑退出条件：当整个矩阵只有一行 或 一列的时候只有一种走法。*/
    public class Robot {
        public int countWays(int x, int y) {
            if ( x==1 || y==1 )
                return 1;

            return countWays(x-1,y)+countWays(x,y-1);
        }
    }
}
