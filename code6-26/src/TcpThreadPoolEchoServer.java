import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TcpThreadPoolEchoServer {
    private ServerSocket serverSocket = null;

    public TcpThreadPoolEchoServer(int port) throws IOException {
       serverSocket = new ServerSocket(port);
    }
    public void start() throws IOException {
        System.out.println("服务器启动");
        //创建线程池完成任务
        ExecutorService executorService = Executors.newCachedThreadPool();
        while(true) {
            System.out.println("尝试连接");
            Socket clientSocket = serverSocket.accept();
            System.out.println("连接成功");
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    processConnection(clientSocket);
                }
            });
        }
    }

    private void processConnection(Socket clientSocket) {
        System.out.printf("[%s:%d] 客户端上线!\n", clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ;BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())))
        {
            while(true) {
                    String request = bufferedReader.readLine();
                    String response = process(request);
                    bufferedWriter.write(response + "\n");
                    //刷新缓冲区上传
                    bufferedWriter.flush();
                System.out.printf("[%s:%d] req: %s; resp: %s\n", clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(), request, response);

                }

        } catch (IOException e) {
            System.out.printf("[%s:%d] 客户端下线!\n", clientSocket.getInetAddress().toString(),
                    clientSocket.getPort());
        }


    }

    private String process(String request) {
        //应答服务器直接返回
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpThreadPoolEchoServer tcpThreadPoolEchoServer = new TcpThreadPoolEchoServer(1040);
        tcpThreadPoolEchoServer.start();
    }
}
