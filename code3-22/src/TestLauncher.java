import com.sun.prism.sw.SWPipeline;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestLauncher {
    public static void swp(int[] array) {
        int tmp = 0;
        tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void swp2(SwpNum swpNum,SwpNum swpNum2) {
        int tmp = swpNum2.getNum();
        swpNum2.setNum(swpNum.getNum());
        swpNum.setNum(tmp);
    }
    public static void main(String[] args) {
        //  类计算加减乘除不同的构造函数。
       /* Cal cal = new Cal(10,20);
        cal.setNum1(10);
        cal.setNum2(20);
        System.out.println("和 " + cal.add());
        System.out.println("除 " + cal.div());
        System.out.println("乘 " + cal.mul());
        System.out.println("减 " + cal.sub());
        Cal cal2 = new Cal(50,60);
        System.out.println("和 " + cal2.add());
        System.out.println("除 " + cal2.div());
        System.out.println("乘 " + cal2.mul());
        System.out.println("减 " + cal2.sub());*/

       //实现交换两个变量的值。要求：需要交换实参的值
        //1,构造数组法
//        int[] arr = {10,20};
//        swp(arr);
//        System.out.println(arr[0] + " " +arr[1]);
        //2,类构造法
        SwpNum swpNum = new SwpNum();
        swpNum.setNum(10);
        SwpNum swpNum2= new SwpNum();
        swpNum2.setNum(20);
        swp2(swpNum,swpNum2);
        System.out.println(swpNum.getNum() + " " + swpNum2.getNum());
    }
}
