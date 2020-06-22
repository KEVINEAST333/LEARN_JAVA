import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoServer {
    // 对于一个服务器程序来说, 核心流程也是要分成两步.
    // 1. 进行初始化操作 (实例化 Socket 对象)
    // 2. 进入主循环, 接受并处理请求. (主循环就是一个 "死循环")
    //   a) 读取数据并解析
    //   b) 根据请求计算响应
    //   c) 把响应结果写回到客户端.
    private DatagramSocket socket = null;

    //构造方法传入端口号
    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    //开始方法
    public void start() throws IOException {
        while (true) {
            // a) 读取请求并解析.
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(requestPacket);
            //将socket 收到的 requestPacket对象的数据转成String trim()去掉空格
            String request = new String(requestPacket.getData(),0, requestPacket.getLength()).trim();
            //处理请求计算响应
            String response = process(request);
            //  把响应写回给客户端, 响应数据就是 response, 需要包装成一个 Packet 对象
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), 0, response.getBytes().length, requestPacket.getSocketAddress());
            socket.send(responsePacket);
            System.out.printf("[%s:%d] req: %s; resp: %s\n", requestPacket.getAddress().toString(),
                    requestPacket.getPort(), request, response);
        }
    }

    private String process(String request) {
        request = request.replace("吗","");
        request = request.replace("？","！");
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(100);
        server.start();
    }
}

