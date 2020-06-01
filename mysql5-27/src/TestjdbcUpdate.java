import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestjdbcUpdate {
    public static void main(String[] args) throws SQLException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("需要更改的学生ID");
        int id = scan1.nextInt();
        System.out.println("更改学生姓名为");
        String name = scan1.next();
        System.out.println("更改的学生班级为");
        int classId = scan1.nextInt();
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("170329");
        Connection connection = dataSource.getConnection();
        String sql =  "update student set name = ?, classId = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        statement.setInt(2,classId);
        statement.setInt(3,id);
        int ret = statement.executeUpdate();
        if(ret == 1) {
            System.out.println("更改成功");
        } else {
            System.out.println("更改失败没有找到该用户");
        }
        statement.close();
        connection.close();
    }
}
