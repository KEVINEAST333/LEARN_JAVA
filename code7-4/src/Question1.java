import java.text.DecimalFormat;
import java.util.Scanner;

/*
(编程题)今年公司年会的奖品特别给力,但获，奖的规矩却很奇葩:
        1.首先，所有人员都将--张写有自己名字的字条放入抽奖箱中;
        2.待所有字条加入完毕,每人从箱中取一一个字条;
        3.如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了!”
        现在告诉你参加晚会的人数,请你计算有多少概率会出现无人获奖?*/
/*【思路解析】
        N个人对应N张纸条，
        1如果第一个人有N个选择的机会，那么第二个人就有N-1个选择的机会，第三个人有N-1个选择机会，以此类推，最后一个人只有一个机会。
        这其实是排列组合的知识点。
        所以：总的可能数=N（N-1）（N-2）...1
        2必须错拿：
        ,如果一个人不能拿自己名字的纸条，那么他可以拿任意剩下的N-1张，
        比如，第1个人拿了第k个人的纸条，第k个人拿了第1个人的纸条，只需将剩下的N-2个人和N-2个纸条错排。
        第1个人拿了第k个人的纸条，但是第k个人没有拿第1个人的纸条，只需将N-1个人和N-1个纸条错排。
        N个元素的错排总数为F（N）
        由递推可得,F(N)=(N-1)[(N-2)+(N-1)]*/
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            float a = noAward(n);
            float b = probability(n);
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            System.out.println(decimalFormat.format(((a / b) * 100) )+"%");
        }
    }

    private static float probability(int n) {
        float p = 1;
        for (int i = n; i > 0;i--) {
             p *= i;
        }
        return p;
    }

    private static float noAward(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return (n - 1) * (noAward(n - 1) + noAward(n - 2));
    }
}
