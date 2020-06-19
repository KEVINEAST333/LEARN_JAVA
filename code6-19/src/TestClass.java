import java.io.*;

public class TestClass {
    public static void main(String[] args) {
        copyFile2("E:\\A-测试\\javaweb线程池.png","E:\\A-测试\\javaweb线程池2.png");
    }
    //使用FileInputStream FileOutputStream拷贝 字节文件
    private static void copyFile(String src,String des) {
        //使用完自动调用close方法
        try(FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(des)) {
            int len = -1;
            //缓存空间bytes 一次考1M
            byte[] bytes = new byte[1024];
            while((len = fileInputStream.read(bytes)) != -1 ) {
                fileOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //使用BufferedInputStream, BufferedOutputStream拷贝 字节文件
    private static void copyFile2(String src,String des) {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(des))
        ) { byte [] bytes = new byte[1024];
            int len = -1;
            while((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes,0,len);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
