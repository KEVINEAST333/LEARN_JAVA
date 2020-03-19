class Student {
    private   int age;
    public  int a;
    private  String name;
    public void eat() {
        System.out.println( name + " " + age + " 吃饭");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }*/
}
public class Text {
    public static void main(String[] args) {
        Student student = new Student("wangdong",21);
//        student.setAge(10);
//        Student.setName("wangdong");
        student.a = 5;
        student.eat();
        Student student2 = new Student("wangdong",22);
    }
}