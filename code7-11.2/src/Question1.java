import java.math.BigInteger;

public class Question1 {
    /*一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。该计划如下:
    我每天给你10万元，你第一天给我1分钱，第二天2分钱，
    第三天4分钱.
            这样交换30天后，百万富翁交出了多少钱?陌生人交出了多少钱? (注意- 个是
    万元，一个是分*/
    public static void main(String[] args) {

        int strange = 0;
        int rich = 1;
        int tmp = 1;
        strange = 10 * 30; //万元
        for(int i = 1;i < 30;i++) {
            tmp *= 2;
            rich += tmp;
        }
        //rich = (int) (Math.pow(2, 30) - 1);
        System.out.print(strange + " " + rich);
    }
}