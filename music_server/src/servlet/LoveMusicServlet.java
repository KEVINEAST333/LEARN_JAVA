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
import java.util.HashMap;
import java.util.Map;

//添加喜欢的音乐到喜欢列表
@WebServlet("/loveMusicServlet")
public class LoveMusicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        Map<String,Object>return_map= new HashMap<>();
        User user = (User)req.getSession().getAttribute("user");
        int u_Id = user.getId();
        System.out.println("user :" + u_Id);
        String musicId = req.getParameter("id");
        int m_Id = Integer.parseInt(musicId);
        System.out.println("music :" + m_Id);
        MusicDao musicDao = new MusicDao();
        Boolean flg = null;
        boolean effect = musicDao.findMusicByMusicId(u_Id,m_Id);
        System.out.println("effect :" + effect);
        if(effect == true) {
            return_map.put("msg",false);
        } else {
            flg = musicDao.insertLoveMusic(u_Id,m_Id);
            if(flg) {
                return_map.put("msg",true);
            }else {
                return_map.put("msg",false);
            }
        }
        ObjectMapper mapper = new ObjectMapper(); //利用Jackson将map转化为json对象
        mapper.writeValue(resp.getWriter(),return_map);
    }
}
