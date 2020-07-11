
/*
输入
        10
        C J
        J B
        C B
        B B
        B C
        C C
        C B
        J B
        B C
        J J
输出
        5 3 2
        2 3 5
        B B
*/
/*
输出描述:
        输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。第
        3行给出两个字母，分别代表甲、乙获胜次数最多的手势，中间有1个空格。
        如果解不唯
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Model mA = new Model();
        Model mB = new Model();
        for(int i = 0; i < n;i++) {
            String a = scanner.next();
            String b = scanner.next();
            judge(a, b, mA, mB);
        }
        System.out.println(mA.win + " " + mA.draw + " " + mA.lose);
        System.out.println(mB.win + " " + mB.draw + " " + mB.lose);
        System.out.println(getMostGen(mA.map) + " " + getMostGen(mB.map));
    }

    private static String getMostGen(Map<String, Integer> map) {
        if(map.get("C") >= map.get("J") ) {
            if(map.get("C") > map.get("B")) {
                return "C";
            } else{
                return "B";
            }
        } else{
            if(map.get("J") > map.get("B")) {
                return "J";
            } else {
                return "B";
            }
        }
    }
    private static void judge(String a, String b, Model mA, Model mB) {
        if (a.equals("J")) {
            if (b.equals("J")) {
                mA.draw++;
                mB.draw++;
            } else if (b.equals("B")) {
                mA.win++;
                mB.lose++;
                mA.map.put("J", mA.map.get("J") + 1);
            } else {
                mA.lose++;
                mB.win++;
                mB.map.put("C", mB.map.get("C") + 1);
            }
        } else if (a.equals("C")) {
            if (b.equals("J")) {
                mA.win++;
                mB.lose++;
                mA.map.put("C", mA.map.get("C") + 1);
            } else if (b.equals("B")) {
                mA.lose++;
                mB.win++;
                mB.map.put("B", mA.map.get("B") + 1);
            } else {
                mA.draw++;
                mB.draw++;
            }
        } else if (a.equals("B")) {
                if (b.equals("J")) {
                    mA.lose++;
                    mB.win++;
                    mB.map.put("J", mA.map.get("J") + 1);
                } else if (b.equals("B")) {
                    mA.draw++;
                    mB.draw++;
                } else {
                    mA.win++;
                    mB.lose++;
                    mA.map.put("B", mA.map.get("B") + 1);
                }
        }
    }
    static class Model {
        int win;
        int draw;
        int lose;
        Map<String,Integer> map = new HashMap<>();

        public Model() {
            map.put("J", 0);
            map.put("B", 0);
            map.put("C", 0);
        }
    }
}
