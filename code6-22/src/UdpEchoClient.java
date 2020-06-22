import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
    // 客户端的主要流程分成四步.
    // 1. 从用户这里读取输入的数据.
    // 2. 构造请求发送给服务器
    // 3. 从服务器读取响应
    // 4. 把响应写回给客户端.
    private DatagramSocket socket = null;
    private String serverIp;
    private int serverPort;

    // 需要在启动客户端的时候来指定需要连接哪个服务器
    public UdpEchoClient(String serverIp, int serverPort) throws SocketException {
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        socket = new DatagramSocket();
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 1. 读取用户输入的数据
            String request = scanner.nextLine();
            // 构造请求发送给服务器
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),
                    request.getBytes().length,InetAddress.getByName(serverIp), serverPort);
            socket.send(requestPacket);
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(), 0,responsePacket.getLength()).trim();
            System.out.println(response);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",100);
        udpEchoClient.start();
    }
}

