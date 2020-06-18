import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class TestClass {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\AAAA.txt");
        System.out.println(file.exists());
        /*file.createNewFile();
        file.delete();*/
    }
}
