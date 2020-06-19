import java.io.*;
//类要继承序列化接口
class Student  implements Serializable {
    String name;
    int age;
}
public class TestClass3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.age = 21;
        student.name = "kevinKing";
        serializeStudent(student);
        Student result = deserializeStudent();
        System.out.println(student.age);
        System.out.println(student.name);
    }
    //序列化使用  ObjectOutputStream类
    private static void serializeStudent(Student student) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\A-测试\\student.txt"));
        // 这个 writeObject 集序列化+写文件 两者同时搞定~
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
    //反序列化
    private static Student deserializeStudent() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\A-测试\\student.txt"));
        Student s = (Student) objectInputStream.readObject();
        return s;
    }
}
