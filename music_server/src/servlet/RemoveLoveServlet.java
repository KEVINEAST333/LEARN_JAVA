package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MusicDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/removeLoveServlet")
public class RemoveLoveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        User user = (User) req.getSession().getAttribute("user");
        int user_id = user.getId();
        Map<String,Object> map=new HashMap<>();
        String strId = req.getParameter("id");
        int music_id = Integer.parseInt(strId);
        MusicDao musicDao = new MusicDao();
        int delete = musicDao.removeLoveMusic(user_id,music_id);
        if(delete == 1) {
            map.put("msg",true);
        }else {
            map.put("msg",false);
        } ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(resp.getWriter(),map);
    }
}
