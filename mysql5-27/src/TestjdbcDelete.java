import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestjdbcDelete {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        //1.创建数据库连接Connection
        //a)创建dataSource对象
        DataSource dataSource = new MysqlDataSource();
        // 接下来需要针对 dataSource 进行一些配置. 以便后面能够顺利的访问到数据库服务器.
        // 主要配置三方面信息. URL, User, Password 需要进行向下转型
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("170329");
        //2.测试连接
        Connection connection = dataSource.getConnection();
        //3拼装sql语句用到 PreparedStatement对象 搞一个Scanner 输入名字
        System.out.println("请输入要删除学生姓名");
        String name = scanner.next();
        String sql = "delete from student where name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        //4.执行sql
        int ret = statement.executeUpdate();
        if(ret == 1) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败没有找到该用户");
        }
        //5.释放资源 statement connection 后创建的先释放
        statement.close();
        connection.close();
    }
}
