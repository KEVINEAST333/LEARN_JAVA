import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;


public class servletDome1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("secondName");
        String password = req.getParameter("password");
        resp.setContentType("text/html; Charset = utf-8");
        Writer write = resp.getWriter();
        // [注意!!!] 一旦调用了 getWriter 方法, 此时 header 的内容就不能再改了
        write.write("<html>");
        write.write("名 :" + firstName);
        write.write("<br/>");
        write.write("姓 :" + secondName);
        write.write("<br/>");
        write.write("密码 :" + password);
        write.write("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
