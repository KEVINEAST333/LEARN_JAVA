package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MusicDao;
import entity.Music;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/deleteServlet")
public class DeleteMusicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("删除指定音乐！");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        Map<String,Object> map = new HashMap<>();
        String str = req.getParameter("id");
        int id = Integer.parseInt(str);
        MusicDao musicDao = new MusicDao();
        Music music = musicDao.findMusicById(id);
        if(music == null) {
            return;
        }
        //删除数据库
        int delete = musicDao.deleteMusicById(id);
        if(delete == 1) {
            //3、数据库删除完成后，检查还是否存在。如果不存在，那么删除掉磁盘上的文件
            File file = new
                    //File("E:\\360MoveData\\Users\\王东\\Desktop\\LEARN_JAVA\\music_server\\web\\"+music.getUrl()+".mp3");
                   // /root/java/tomcat/apache-tomcat-8.5.57/webapps/onlineMusic/music
            File("/root/java/tomcat/apache-tomcat-8.5.57/webapps/onlineMusic/"+music.getUrl()+".mp3");
            System.out.println("文件是否存在："+file.exists());
            System.out.println("file: "+file);
            if(file.delete()){
//证明删除成功
                map.put("msg",true);
            }else {
                map.put("msg",false);
                System.out.println("文件名："+file.getName());
                System.out.println("删除文件失败！");
            }
        }else {
            map.put("msg",false);
        }
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(resp.getWriter(),map);
        }
    }
