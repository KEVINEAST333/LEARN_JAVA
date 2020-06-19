public class Question1 {
    public static void main(String[] args) {

    }
    //另类加法
/*    * 二进制加法特点
     * 位的异或运算跟求‘和’的结果一致：
            *  异或 1^1 = 0   1^0 = 1 0^0 = 0
            *  求和 1+1 = 0   1+0 = 1 0+0 = 0
            * 位的与运算跟求‘进位’的结果一致:
            *  位 与 1&1 = 1 1&0 = 0 0&0 = 0
            *  进位  1+1 = 1 1+0 = 1 0+0 = 0*/
    public int addAB(int A, int B) {
        while(B != 0) {
            int xor = A ^ B;//求和不求进位
            int add = (A & B) << 1;//求进位
            A = xor;
            B = add;//进位为零
        }
        return A;
    }
}
