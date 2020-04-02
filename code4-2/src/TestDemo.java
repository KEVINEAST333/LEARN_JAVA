class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
class Frog extends Animal implements ISwim {
    public Frog(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + "游泳");
    }
}
class Dog extends Animal implements IRun{
    @Override
    public void run() {
        System.out.println(name + "狗跑");
    }

    public Dog(String name) {
        super(name);
    }
}
class Human extends Animal implements IRun,ISwim {
    public Human(String name) {
        super(name);
    }
    public void run() {
        System.out.println(name + " 人跑了");
    }

    @Override
    public void swim() {
        System.out.println(name + " 人游泳去了");
    }
}
    interface ISwim {
        void swim();
    }

    interface IRun {
        void run();
    }

public class TestDemo {
    public static void swim(ISwim swim) {
        swim.swim();
    }public static void run(IRun run) {
        run.run();
    }

    public static void main(String[] args) {
        Frog frog= new Frog("guagua");
        Human human = new Human("wangdong");
        Dog dog = new Dog("wancai");
        swim(frog);
        swim(human);
        run(human);
        run(dog);

    }
}
