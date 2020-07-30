package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.UserDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username :"  + username );
        System.out.println("password :"  + password );
        UserDao userDao = new UserDao();
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        User user = userDao.login(loginUser);
        Map<String ,Object> return_map = new HashMap<>();
        try {
            if(user != null) {
                req.getSession().setAttribute("user", user);//绑定数据
                return_map.put("msg",true);
                System.out.println("登陆成功");
            }
            else {
                System.out.println("登陆失败");
                return_map.put("msg",false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //login.html需要json类型数据 将return_map转化为json
        ObjectMapper mapper = new ObjectMapper(); //利用Jackson将map转化为json对象
        mapper.writeValue(resp.getWriter(),return_map);
    }
}
