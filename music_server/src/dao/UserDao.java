package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;
import util.DBUtils;
public class UserDao {
    //dao层 -> 数据库接口
    /**
     * *
     依据用户名查询，如果找不到，返回null,
     * 否则返回一个User对象（包含了用户的所有信息）
     * *

      /
     **
     * 注册
     */
    //登录
    public  User login(User loginUser) {
        User user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,loginUser.getUsername());
            ps.setString(2,loginUser.getPassword());
            rs = ps.executeQuery();
            while(rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAge(rs.getInt("age"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("gender"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DBUtils.close(conn,ps,rs);
        }
        return user;
    }
    //注册、
    public static void register(User user) {
        Connection cnn = null;
        PreparedStatement ps = null;
        //ResultSet rs = null;
        try {
            cnn = DBUtils.getConnection();
            String sql = "insert into user values (null,?,?,?,?,?)";
            ps = cnn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAge());
            ps.setString(4, user.getGender());
            ps.setString(5, user.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(cnn,ps,null);
        }
    }

    public static void main(String[] args) {
       /* 测试login
       User user = new User();
        user.setUsername("wang");
        user.setPassword("123");
        User res = login(user);
        System.out.println(res);*/
        User user = new User();
        user.setUsername("qiao");
        user.setPassword("123");
        user.setAge(18);
        user.setEmail("dd@love");
        user.setGender("W");
        register(user);

    }
}