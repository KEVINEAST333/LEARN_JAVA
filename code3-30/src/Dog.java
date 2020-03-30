public class Dog extends Animal {
    int age ;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }
    public Dog() {

    }
    public void call () {
        System.out.println("ww");
    }
    public void eat(String name) {
        System.out.println(name + "正在吃s");
    }
}
