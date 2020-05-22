public class Cat {
    private static String name = "小花猫";
    private int age;
    private static void eat(String food) {
        System.out.println(name + "吃" + food);
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
