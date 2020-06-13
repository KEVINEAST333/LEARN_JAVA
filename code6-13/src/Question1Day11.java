public class Question1Day11 {
    public int[] multiply(int[] A) {
        int [] B = new int[0];
        int len = A.length;
        if (len != 0) {
            B = new int[len];
            //计算下三角
            B[0] = 1;
            for(int i = 1;i < len;i++) {
                B[i] = B[i-1] * A[i-1];
            }
            int tmp = 1;
            //计算上三角
            //并把上下三角相乘
            for(int j = len-2;j >= 0;j--) {
                tmp = tmp * A[j+1];
                B[j] = B[j] * tmp;
            }
        }
        return B;
    }
}
