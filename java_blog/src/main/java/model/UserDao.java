package model;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    // 1. 新增用户(注册)
    //   把一个 User 对象插入到数据库中.
    public void add(User user) {
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL 语句
        PreparedStatement statement = null;
        String sql = "insert into user values(null,?,?)";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getName());
            statement.setString(2,user.getPassword());
            int ret = statement.executeUpdate();
            System.out.println(ret);
            if(ret != 1) {
                System.out.println("插入新用户失败!");
                return;
            }
            System.out.println("插入新用户成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, null);
        }
    }
    // 2. 按照名字查找用户(登陆)
    public User selectByName(String name) {
        // 1. 和数据库建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL 语句
        String sql = "select * from user where name = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            // 3. 执行 SQL
            resultSet = statement.executeQuery();
            if(resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    public User selectById (int userId){
        //1.建立数据库连接
        Connection connection = DBUtil.getConnection();
        // 2.拼装sql
        String sql = "select * from user where userId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1,userId);
            resultSet = statement.executeQuery();
            if(resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        /*user.setName("wyh");
        user.setPassword("333");
        userDao.add(user);*/
         //user = userDao.selectById(1);
      /*  user = userDao.selectByName("wd");
        System.out.println(user);*/
    }
}
