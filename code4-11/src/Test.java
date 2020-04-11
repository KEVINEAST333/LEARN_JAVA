class A<T> {
    public T vaule ;

    public A(T vaule) {
        this.vaule = vaule;
    }

    public T getVaule() {
        return vaule;
    }
}
public class Test {
    public static void main(String[] args) {
        A<String> a = new A<>("aaaa");
        System.out.println(a.getVaule());
    }
}
