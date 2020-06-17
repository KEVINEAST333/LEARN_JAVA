import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

public class TestClassIO {
    public static void main(String[] args) throws IOException {
      //File file = new File("E:\\Games");
//        File file2 = new File("E://A-测试.txt");
    File file = new File("E://A-测试//1");
        //file.mkdir();
        //System.out.println(file.exists());
        //file3.mkdirs();
        //System.out.println(file3.delete());
//        System.out.println(file3.delete());
//        System.out.println(file3.isDirectory());
//        System.out.println(file3.exists());
        // System.out.println(file3.getPath());
        //System.out.println(file2.getPath());
        /*File [] file1 = file.listFiles();
        for(File f :  file1) {
            System.out.println(f);
        }*/
       //listAllfile(file);
        //System.out.println(file.exists());
        //File file1 = new File("E:\\A-测试\\1\\2\\3");
        //System.out.println(file1.delete());
    }
    // 递归的罗列出一个目录中的所有文件.
    public static void  listAllfile(File file) {
        if (file.isDirectory()) {
            File [] files = file.listFiles();
            for(File f : files) {
                listAllfile(f);
            }

        }
        //file.delete();
        else {
            System.out.println(file);
        }
    }
}
