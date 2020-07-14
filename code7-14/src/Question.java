/*有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这
        些木棒以某个顺序首尾相连构成一个面积大于 0的简单多边形且所有木棒都要用
        上，简单多边形即不会自交的多边形。
        初始集合是空的，有两种操作，要么给集合添加一个长度为L的木棒，要么删去
        集合中已经有的某个木棒。每次操作结束后你都需要告知是否能用集合中的这些
        木棒构成一个简单多边形。*/
/*输入
        5
        1 1
        1 1
        1 1
        2 1
        1 2
        输出
        No
        No
        Yes
        No
        No*/
/*判断几条棍子能否组成面积大于0的简单多边形只需满足一个条件:
        木棍集合中找出一根最长的，记为max
        除了这一根外，剩下的长度之和，记为len .
        则必须满足Len > max_ len 。
        换言之，设总长度为sum,
        则仅当sum - max > max 时，才能组成面积大于0的简单多边形
        那剩下的编程就简单多了*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
       for(int j = 0; j < n; j++) {
            int sum = 0;
            int max = 0;
            int flag = scanner.nextInt();
            int len = scanner.nextInt();
           scanner.nextLine();
            if(flag == 1) {
                arrayList.add(len);
            } else {
                if(!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.indexOf(len));
                }
            }
            Collections.sort(arrayList);
            max = arrayList.get(arrayList.size() - 1);
            for(int i = 0; i < arrayList.size() ;i++) {
                sum += arrayList.get(i);
            }
            if((sum - max) > max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
