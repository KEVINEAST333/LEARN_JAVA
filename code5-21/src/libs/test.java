package libs;

import java.sql.*;
class Test {
    public static void  main(String[] args){
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password="170329";
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url,user,password);
            String sql="select * from student;";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("s_id"));
            }
            rs.close();
            ps.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(conn!=null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
