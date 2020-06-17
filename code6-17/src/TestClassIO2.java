import java.io.*;
//使用字节流复制文件
public class TestClassIO2 {
    public static void main(String[] args) throws IOException {
        copyFile("E:\\A-测试\\A-测试.txt","E:\\A-测试\\A-测试2.txt");
    }

    private static void copyFile(String scrPath,String desPath) throws IOException {
        // 0. 先打开文件, 才能够读写. (创建 InputStream / OutputStream 对象的过程)
        FileInputStream fileInputStream = new FileInputStream(scrPath);
        FileOutputStream fileOutputStream = new FileOutputStream(desPath);
        // 1. 需要读取 srcPath 对应的文件内容
        byte[] bytes = new byte[1024];
        // 单次读取的内容是存在上限(缓冲区的长度), 要想把文件整个都读完, 需要搭配循环来使用.
        int len = 0;
        //读完返回-1
        while ((len = fileInputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
