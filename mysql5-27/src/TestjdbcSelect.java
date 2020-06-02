
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestjdbcSelect {
    public static void main(String[] args) throws SQLException {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要查找的表名");
        String tableName = scanner.next();*/
        //1.创建数据库连接connection
        //a)创建dataSource对象
        DataSource dataSource = new MysqlDataSource();
        //b)配置dataSource
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("170329");
        //2.测试连接
        Connection connection = dataSource.getConnection();
        //3使用PrepareStatement拼装sql语句
        String sql = "select * from student" ;
        PreparedStatement statement = connection.prepareStatement(sql);
        //4.执行sql语句
        ResultSet resultSet = statement.executeQuery();
        // 5. 遍历结果集. 遍历过程和使用迭代器遍历集合类有点像
        //    结果集相当于一张表. 这个表里有很多行, 每一行是一条记录(又包含很多列)
        //    next() 一方面是判定当前是否存在下一行. 另一方面如果存在下一行就获取到这一行.
        //    可以直观的把 resultSet 对象想象成是一个 "光标"
        while(resultSet.next()) {
            // resultSet 的光标指向了当前行, 就可以把当前行中的列数据都获取到
            // 当前测试用的student 表中的每一行包含三个列. id, name, classId, 可以根据列名来获取对应的列数据.
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int classId = resultSet.getInt("classId");
            System.out.println("id: " + id + " name: " + name + " classId: " + classId);
        }
        //6.释放资源 后创建的先释放
        resultSet.close();
        statement.close();
        connection.close();
    }
}
