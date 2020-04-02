//class X{
////    Y y=new Y();
////    public X(){
////        System.out.print("X");
////    }
////}
////class Y{
////    public Y(){
////        System.out.print("Y");
////    }
////}

class E {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends E {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
public class TestDrive {
    public static void main(String[] args) {
        E a = new E();
        E b = new D();
        a.Func();
        b.Func();
    }
}
//public class TestDrive2 extends Orign{
//    public void  eat() {
//        System.out.println("eat");
//    }
//    public void  fly() {
//        System.out.println("fly");
//    }
   // TestDrive() {
   // }
//Y y=new Y();
//    public TestDrive(){
//        System.out.print("Z");
//    }
//private  void eat() {
//    System.out.println("test eat");
//}
//    public static void main(String[] args) {
//        //TestDrive testDrive = new TestDrive();
//        Orign orign = new TestDrive();
//        orign.eat();
////
//        A a0 = new A("s");
//        A a1 = new B("s",10);
//        A a2 = new C("s",2,5);
        //TestDrive testDrive = new TestDrive();
        //Orign orign = new Orign();

 //  }
//}
