public class TestDrive {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog =new Dog();
        animal = dog;
        animal.eat("ww");

        dog.eat("狗");

    }
}
