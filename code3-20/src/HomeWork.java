class Test {
    //    public static void hello() {
//        System.out.println("hello");
//    }
//    public  static int aMethod() {
//        static int i = 0;
//        i++;
//        return i;
//    }
    private float f = 1.0f;
    int m = 12;
    static int n = 1;

//    public float getF() {
//        return f;
//    }
//
//    public void setF(float f) {
//        this.f = f;
//    }
    public void fun(int x) {
        System.out.println(x);
    }
    public void a (int y) {
        this.fun(12);
    }

}
public  class HomeWork {
    private static int a = 100;
    int b;
    static boolean Paddy;
    public static void main(String[] args) {
//        Test test=null;
////        Test.hello();
//        String s ;
//        System.out.println("s="+ s);
        HomeWork homeWork = new HomeWork();
        homeWork.a++;
        System.out.println(Paddy);
        Test test = new Test();
//        System.out.println(test.getF());
        test.m = 10;
        Test.n = 10;

    }
}
