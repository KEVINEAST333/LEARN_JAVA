import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestjdbcCreate {
    public static void main(String[] args) throws SQLException {

        DataSource dataSource = new MysqlDataSource();
        //String tabeleName = " test (id int ,name varchar(20))";
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("170329");
        Connection connection = dataSource.getConnection();
        String sql =  "create table test (id int ,name varchar(20))" ;
        //删除
        //String sql =  "drop table test" ;
        //String sql = "create table" + tabeleName;
        PreparedStatement statement = connection.prepareStatement(sql);
        int ret = statement.executeUpdate();
        if(ret == 0) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
        statement.close();
        connection.close();
    }
}

