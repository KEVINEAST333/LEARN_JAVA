package servlet;

import entity.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/upload")
//上传音乐文件到指定目录
public class UploadMusicServlet extends HttpServlet {
    private final String SAVEPATH = "E:\\360MoveData\\Users\\王东\\Desktop\\LEARN_JAVA\\music_server\\web\\music\\";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        User user = (User) req.getSession().getAttribute("user");
        if(user == null) {
            System.out.println("请登录");
            req.setAttribute("Msg", "请登录后再进行上传");
        } else {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
            try {
                items = upload.parseRequest(req);
            } catch (FileUploadException e) {
                e.printStackTrace();
                return;
            }
            System.out.println("items:"+items );
            FileItem item = items.get(0);
            System.out.println("item： "+item);
            String fileName = item.getName();
            System.out.println("fileName"+fileName);
            req.getSession().setAttribute("fileName", fileName);
            System.out.println("准备上传");
            try {
                item.write(new File(SAVEPATH, fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
            resp.sendRedirect("uploadsucess.html");
        }
    }
}
