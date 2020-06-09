public class TestExamDay08 {
    static int cnt = 6;
    static {
        cnt += 9;
    }
    public static void main(String[] args) {
       /* Double x = 3.0;
        int y = 5;
        System.out.println(x/= --y);*/
        //System.out.println(cnt);
        int [] array = {1,2,3,4,5,6};
        for(int i : array) {
            System.out.println(i);
            if(i == 4) {
                return ;
            }
        }
    }
    static {
        cnt /= 3;
    }
}
