package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MusicDao;
import entity.Music;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//查找我喜欢的音乐列表
@WebServlet ("/findLoveMusic")
public class FindLoveMusicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        System.out.println("测试查找函数");
        String str = req.getParameter("loveMusicName");
        User user = (User) req.getSession().getAttribute("user");
        MusicDao musicDao = new MusicDao();
        List<Music> loveMusiclist = new ArrayList<>();
        System.out.println(user.getId());
        if(str != null) {
            System.out.println(1);
            loveMusiclist =  musicDao.ifMusicLove(str,user.getId());
        } else {
            System.out.println(2);
            loveMusiclist = musicDao.findLoveMusic(user.getId());
        }
        for (Music music : loveMusiclist) {
            System.out.println(music.getUrl());
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),loveMusiclist);
    }
}
