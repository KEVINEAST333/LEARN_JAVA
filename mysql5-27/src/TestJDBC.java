import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入学生的id,name,classId 用逗号隔开");
        String str = scanner.nextLine();
        String[] strings = str.split(",");
        int id = Integer.parseInt(strings[0]);
        String name = strings[1];
        int classId = Integer.parseInt(strings[2]);
//1. 创建数据库连接Connection
        // a. 创建 DataSource 对象(DataSource 对象生命周期应该是要跟随整个程序
        DataSource dataSource = new MysqlDataSource();
       // 接下来需要针对 dataSource 进行一些配置. 以便后面能够顺利的访问到数据库服务器.
       // 主要配置三方面信息. URL, User, Password 需要进行向下转型
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("170329");
// 2. 和数据库建立连接. 建立连接好了之后就可以进行后续的数据传输了
        //    建立连接的意义是为了验证当前的网络通信是否正常.
        //    如果不正常就会抛出 SQLException 异常
        //    connection 对象生命周期应该是较短的. 每个请求创建一个新的 connection.
        Connection connection = dataSource.getConnection();
// 3. 拼装 SQL 语句, 用到 PrepareStatement 对象
        //    先以插入数据为例
        //    当前示例中要插入的数据内容都是写死的. 其实也可以让程序在运行时获取到
        //    动态的拼接进去
        String sql = "insert student values (?, ?, ?)";
        //String sql2 = "insert student values(? ,? ,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //PreparedStatement statement2 = connection.prepareStatement(sql2);
        statement.setInt(1,id);
        statement.setString(2,name);
        statement.setInt(3,classId);

       /* statement2.setInt(1,2);
        statement2.setString(2, "武元昊");
        statement2.setInt(3,7);*/
// 4. 拼装完毕之后, 可以执行 SQL 了
        //    insert  delete  update 都使用 executeUpdate 方法来执行.
        //    select 就使用 executeQuery 来执行.
        //    返回值表示此次操作修改了多少行.
        int ret = statement.executeUpdate();
        if(ret == 1) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        //statement2.executeUpdate();
//5. 释放资源 使用.close
        //    一定是后创建的被先释放. 顺序不能搞错
        //statement2.close();
        statement.close();
        connection.close();
    }
}
