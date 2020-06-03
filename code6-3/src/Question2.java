public class Question2 {
    //返回数组中逆序个数
    public int count(int[] A, int n) {
        int result =0;
        for(int i = 0; i < n;i++) {
            for(int j = i + 1 ;j < n;j++) {
                if(A[i] > A[j]) {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
