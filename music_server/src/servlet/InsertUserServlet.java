package servlet;

import dao.UserDao;
import entity.User;
import view.HtmlGenerator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
@WebServlet("/InsertUserServlet")
public class InsertUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
      String userName = req.getParameter("userName");
      String password = req.getParameter("password");
      String strAge = req.getParameter("age");
      int age = Integer.parseInt(strAge);
      String gender = req.getParameter("gender");
      String email = req.getParameter("email");
      User user = new User();
      user.setUsername(userName);
      user.setPassword(password);
      user.setAge(age);
      user.setEmail(email);
      user.setGender(gender);
        UserDao userDao = new UserDao();
        System.out.println(user.toString());
        if(userDao.login(user) != null) {
            String html = HtmlGenerator.getMessagePage("该用户已经注册! 点击跳转重新注册!",
                    "regist2.html");
            resp.getWriter().write(html);
        } else {
            if(userDao.register(user)) {
                String html = HtmlGenerator.getMessagePage("用户注册成功! 点击跳转登录！",
                        "login.html");
                resp.getWriter().write(html);
            } else {
                String html = HtmlGenerator.getMessagePage("注册失败，填写信息有误! 点击跳转重新注册!",
                        "regist2.html");
                resp.getWriter().write(html);
            }
        }

    }
}
