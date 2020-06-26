import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TcpEchoClient {
    // 1. 启动客户端(一定不要绑定端口号) 和服务器建立连接
    // 2. 进入主循环
    //  a) 读取用户输入内容
    //  b) 构造一个请求发送给服务器
    //  c) 读取服务器的响应数据
    //  d) 把响应数据显示到界面
    Socket socket = null;

    public TcpEchoClient(String serverIp, int serverPort) throws IOException {
        socket = new Socket(serverIp,serverPort);
    }
    public void start() {
        System.out.println("客户端启动");
        Scanner scanner = new Scanner(System.in);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            while(true) {
                String request = scanner.nextLine();
                bufferedWriter.write(request);
                bufferedWriter.flush();
                String result = bufferedReader.readLine();
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.1",104);
        tcpEchoClient.start();
    }
}
