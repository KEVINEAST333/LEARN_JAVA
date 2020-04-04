class Money implements Cloneable{
    public int Money  = 11;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
class Person implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person)super.clone();
        person.m =(Money) this.m.clone();
        return person;

    }

    public int age;
    public Money m;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", m=" + m +
                '}';
    }

    public Person(int age) {
        this.age = age;
        m =new Money();
    }
}
public class TestDrive {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(21);
        Person person1 = (Person) person.clone();
        person.m.Money = 10;
        System.out.println(person.m.Money);
        System.out.println(person1.m.Money);
    }
}
