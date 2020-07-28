package dao;

import entity.Music;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusicDao {
    /**
     * 查询全部歌单
     */
    public  List<Music> findMusic() {
        Connection cnn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Music> musics = new ArrayList<>();
        try {
            cnn = DBUtils.getConnection();
            String sql = "select  * from music";
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(cnn,ps,rs);
        }
        return musics;
    }
    /**
     * 根据id查找音乐
     * @param id
     * @return
     */
    public  Music findMusicById(int id){
        Connection cnn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Music music = null;
        try {
            cnn = DBUtils.getConnection();
            String sql = "select  * from music where id = ? ";
            ps = cnn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()) {
                music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(cnn,ps,rs);
        }
        return music;
    }
    //模糊查找音乐
    public  List<Music> ifMusic(String str){
        List<Music> musics = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select*from music where title like '%"+str+"%'");
            rs = ps.executeQuery();
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DBUtils.close(conn, ps, rs);
        }
        return musics;
    }
    //上传歌曲
    public  int Insert(String title, String singer, String time, String url, int userid) {
        Connection cnn = null;
        PreparedStatement ps = null;
        int ret = 0;
        try {
            cnn = DBUtils.getConnection();
            String sql = "insert into music values (null ,?,?,?,?,?)";
            ps = cnn.prepareStatement(sql);
            ps.setString(1,title);
            ps.setString(2,singer);
            ps.setString(3,time);
            ps.setString(4,url);
            ps.setInt(5,userid);
             ret = ps.executeUpdate();
             return ret;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(cnn,ps,null);
        }
        return ret;
    }
    public int deleteMusicById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "delete from music where id=?";
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int ret = preparedStatement.executeUpdate();
            if(ret == 1) {
//同时删除中间表中的数据
//1、看中间表是否有数据，如果有删除
                if(findLoveMusicOnDel(id)) {
                    int ret2 = removeLoveMusicOnDelete(id);
                    if(ret2 == 1){
                        return 1;
                    }
                } else {
//如果没有找到，说明这首歌，没有被添加到喜欢的列表
                    return 1;
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(connection,preparedStatement,null);
        }
        return 0;
    }
    //查找该id的音乐是否在我喜欢音乐上存在
    public boolean findLoveMusicOnDel(int id) {
        Connection cnn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            cnn = DBUtils.getConnection();
            String sql = "select * from lovemusic where  music_id = ?";
            ps = cnn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    //根据id在喜欢的表中删除
    public int removeLoveMusicOnDelete(int musicId) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "delete from lovemusic where music_id=?";
            conn = DBUtils.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, musicId);
            int ret = preparedStatement.executeUpdate();
            if (ret == 1) {
                return ret;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(conn, preparedStatement, null);
        }
        return 0;
    }
    //增加喜爱的音乐
    public boolean insertLoveMusic(int userId,int musicId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "insert into lovemusic(user_id, music_id) values (?,?)";
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,userId);
            preparedStatement.setInt(2,musicId);
            int ret = preparedStatement.executeUpdate();
            if (ret == 1) {
                return true;
            }
            return false;
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(connection,preparedStatement,null);
        }
        return false;
    }
    //移除喜爱的音乐
    public int removeLoveMusic(int userId,int musicId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "delete from lovemusic where user_id=? and music_id=?";
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,userId);
            preparedStatement.setInt(2,musicId);
            int ret = preparedStatement.executeUpdate();
            if(ret == 1) {
                return ret;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(connection,preparedStatement,null);
        } return 0;
    }

    /**
            * 添加喜欢的音乐的时候，需要先判断该音乐是否存在
* @param musicID
* @return
        */
    public boolean findMusicByMusicId(int user_id,int musicID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select * from lovemusic where music_id=? and user_id=?");
            ps.setInt(1,musicID);
            ps.setInt(2,user_id);
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtils.close(conn, ps, rs);
        } return false;
    }
    //查找喜爱的音乐
    public List<Music> findLoveMusic(int user_id){
        List<Music> musics = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select * from music where id in" +
                    " (select music_id from lovemusic where user_id = ?)");
            ps.setInt(1,user_id);
            rs = ps.executeQuery();
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("music_id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        }finally {
            DBUtils.close(conn, ps, rs);
        } return musics;
    }
    /**
            * 根据关键字查询喜欢的歌单
* @param str
* @return
        */
    public  List<Music> ifMusicLove(String str,int user_id){
        List<Music> musics = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select m.id as music_id,title,singer,time,url,userid from lovemusic lm,music m " +
                    "where lm.music_id = m.id and user_id = ? and title like '%"+str+"%'");
            ps.setInt(1,user_id);
            rs = ps.executeQuery();
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("music_id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DBUtils.close(conn, ps, rs);
        } return musics;
    }
    public static void main(String[] args) {
        //Insert("盗将行","花粥","20200728","wangyi.com",1);
       // Music music = findMusicById(1);
        //System.out.println(music.toString());
        //List<Music> musics = ifMusic("将");
        //System.out.println(musics.toString());
       /* List<Music> res = ifMusicLove("将",1);
        System.out.println(res.toString());*/
    }

}
