public class TestExam {
    static class A {
        public A (String s) {

        }
    }
    public static void main(String[] args) {
        A a = new A("ss");
        A b = new A("ss");
        System.out.println(a == b);
    }

}
