import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//test lambda表达式
public class TestLambda {
    static class Student {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",21));
        list.add(new Student("李四",23));
        list.add(new Student("王五",19));
        list.add(new Student("小六",10));
     /*   list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });*/
        //list.sort(( o1,o2) ->  o1.age -  o2.age);
        list.sort((Student o1,Student o2) -> {
            return o1.age - o2.age;
        });
        System.out.println(list.toString());
    }

}
