package LeetCode;

import java.sql.Connection;
import java.util.*;

/*输入：target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
        输出：3
        解释：
        从 10 和 8 开始的车会组成一个车队，它们在 12 处相遇。
        从 0 处开始的车无法追上其它车，所以它自己就是一个车队。
        从 5 和 3 开始的车会组成一个车队，它们在 6 处相遇。
        请注意，在到达目的地之前没有其它车会遇到这些车队，所以答案是 3。*/
public class Sloution3 {
    static class Car {
        int postion;
        Double time;
        public Car(int postion, Double time) {
            this.postion = postion;
            this.time = time;
        }

    }

    public static int carFleet(int target, int[] position, int[] speed) {
        List<Car> list = new ArrayList<Car>();
        int length = position.length;
        for (int i = 0; i < length ;i++) {
          Car car =  new Car(position[i],(target - position[i]) * 1.0 / speed[i]);
            list.add(car);
        }
        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.postion - o1.postion;
            }
        });
        int ret = length;
        for(int j = 1;j < length;j++) {
            if (list.get(j).time <= list.get(j-1).time) { // catch up
                ret--;
                list.get(j).time = list.get(j - 1).time;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
       /* target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
        输出：3*/
       int [] p = {10,8,0,5,3};
       int [] s = {2,4,1,1,3};
       int ret = carFleet(12,p,s);
        System.out.println(ret);
    }
}
