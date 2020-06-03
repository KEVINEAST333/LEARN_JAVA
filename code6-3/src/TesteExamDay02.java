import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

abstract class A {
    //静态方法不能杨浦{}
    public int count = 5;
    public void method() {}
    public abstract void method2 ();
}

class Test extends A {
    public static void hello() {
        System.out.println("hello");
    }
    public void method() {
        System.out.println("s");
    }
    public void method2 (){

    }
}
public class TesteExamDay02 {
    public static void main(String[] args) {
      /*  Test.hello();
        Test test = new Test();
        test.hello();*/
      String s = new String("sss");
      String a = "sss";
        //System.out.println(s.toLowerCase().equals(a));
        System.out.println(s == a);
    }
}
