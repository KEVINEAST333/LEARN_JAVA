//每日一题
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Question1 {
    /*示例：
    jack      70
    peter     96
    Tom       70
    smith     67
    从高到低  成绩
    peter     96
    jack      70
    Tom       70
    smith     67
    从低到高
    smith     67

    jack      70
    Tom      70
    peter     96*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int len = scanner.nextInt();
            int n = scanner.nextInt();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0;i < len;i++) {
                students.add(new Student(scanner.next(),scanner.nextInt()));
            }
            //down
            if(n == 0) {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            }
            //up
            if(n == 1) {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            }
            for (int i = 0;i < students.size();i++) {
                System.out.println(students.get(i).name + " " + students.get(i).score);
            }
        }

    }
}
class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

