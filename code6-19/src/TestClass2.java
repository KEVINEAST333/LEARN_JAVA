import java.io.*;

public class TestClass2 {
    //字符流
    public static void main(String[] args) {
        copyFile2("E:\\A-测试\\A-测试.txt","E:\\A-测试\\A-测试3.txt");
    }
    private static void copyFile(String src,String des) {
        try(FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(des)) {
            char[] chars = new char[1024];
            while(fileReader.read(chars) != -1) {
                fileWriter.write(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
    private static void copyFile2(String src,String des) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(des))) {
            char[] chars = new char[1024];
            while( bufferedReader.read(chars) != -1) {
                bufferedWriter.write(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
