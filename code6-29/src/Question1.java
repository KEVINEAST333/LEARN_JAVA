import javafx.collections.ArrayChangeListener;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
/*北京大学对本科生的成绩施行平均学分绩点制(GPA) 。既将学生的实际考分根
        据不同的学科的不同学分按一定的公式进行计算。 公式如下: 实际成绩绩点90
        100 4.0 85-89 3.7 82一84  3.3 78一81 3.0 75一77 2.7 72一74
        2.3 68-
       - 71 2.0 64
        -67 1.560
        -63 1.0 60以下0 1.一门课程的学分绩点=
        该课绩点"该课学分2.总评绩点=所有学科绩点之和/所有课程学分之和现要求你
        编写程序求出某人A的总评绩点(GPA)，*/
       /* 输入描述:
        第一行总的课程数n (n<10) ;
        第二行相应课程的学分(两个学分间用空格隔开) ;
        第三行对应课程的实际得分;
        此处输入的所有数字均为整数。*/


public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> credits = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            int sum_cr = 0;
            double sum_po = 0.0;
            for(int i = 0;i < n ;i++) {
                credits.add(scanner.nextInt());
            }
            for(int j = 0;j < n ;j++) {
                scores.add(scanner.nextInt());
            }
            for (int k = 0; k < n;k++) {
                int score = scores.get(k);
                sum_cr += credits.get(k);
                if(score >= 90 && score <= 100) {
                    sum_po += 4.0* credits.get(k);
                } else if(score >= 85 && score <= 89) {
                    sum_po += 3.7* credits.get(k);
                }else if(score >= 82 && score <= 84) {
                    sum_po += 3.3* credits.get(k);
                }else if(score >= 78 && score <= 81) {
                    sum_po += 3.0* credits.get(k);
                }else if(score >= 75 && score <= 77) {
                    sum_po += 2.7* credits.get(k);
                }else if(score >= 72 && score <= 74) {
                    sum_po += 2.3* credits.get(k);
                }else if(score >= 68 && score <= 71) {
                    sum_po += 2.0* credits.get(k);
                }else if(score >= 64 && score <= 67) {
                    sum_po += 1.5* credits.get(k);
                }else if(score >= 60 && score <= 63) {
                    sum_po += 1.0* credits.get(k);
                } else {
                    sum_po += 0.0* credits.get(k);
                }
            }
            System.out.println(decimalFormat.format(sum_po/(double) sum_cr) );
        }
    }
}
