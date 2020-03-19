import javax.naming.Name;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 20;
        d.name = "旺财";
        d.brak();
        person wang = new person();
//        wang.name = "wangdong";
        wang.age = 21;
        wang.sex = "man";
        System.out.println(wang.name);
    }
}
