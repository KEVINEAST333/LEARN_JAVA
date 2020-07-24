package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
public class ArticleDao {
    //增加文章
    public void add(Article article) {
        // 1. 获取数据库连接
        Connection connection = DBUtil.getConnection();
        PreparedStatement statement = null;
        // 2. 构造 SQL
        String sql = "insert into article values (null, ?, ?, ?)";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,article.getTitle());
            statement.setInt(2,article.getUseId());
            statement.setString(3,article.getContent());
            int ret = statement.executeUpdate();
            if(ret != 1) {
                System.out.println("插入文章失败!");
                return;
            }
            System.out.println("插入文章成功!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,null);
        }
    }
    // 2. 查看文章列表(把所有的文章信息都查出来(没必要查正文))
    public List<Article> selectAll() {
        List<Article> articles = new ArrayList<>();
        //1.建立连接
        Connection connection = DBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        //2.构造sql
        String sql = "select articleId ,title ,userId from article";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Article article = new Article();
                article.setArticleId(resultSet.getInt("articleId"));
                article.setTitle(resultSet.getString("title"));
                article.setUseId(resultSet.getInt("userId"));
                articles.add(article);
            }
            return articles;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    // 3. 查看指定文章详情. (需要查正文)
    public Article selectById(int articleId) {
        //1.建立连接
        Connection connection = DBUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from article where articleId = ?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1,articleId);
            resultSet = statement.executeQuery();
            //2.遍历结果集
            if(resultSet.next()) {
                Article article = new Article();
                article.setUseId(resultSet.getInt("userId"));
                article.setTitle(resultSet.getString("title"));
                article.setArticleId(resultSet.getInt("articleId"));
                article.setContent(resultSet.getString("content"));
                return article;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    // 4. 删除指定文章(给定文章 id 来删除)
    public void delete(int articleId) {
        //1.连接数据库
        Connection connection = DBUtil.getConnection();
        //2.sql语句
        String sql= "delete from article where articleId = ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1,articleId);
            int ret = statement.executeUpdate();
            if(ret == 1) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,null);
        }

    }
    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDao();
        // 1. 测试新增文章
 /*      Article article = new Article();
        article.setTitle("我是标题2");
        article.setContent("我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2我是正文2");
        article.setUseId(1);
        articleDao.add(article);*/
        // 2. 测试查看文章列表
//        List<Article> articles = articleDao.selectAll();
//        System.out.println(articles);
        // 3. 查看指定文章内容
//        Article article = articleDao.selectById(1);
//        System.out.println(article);
        // 4. 删除文章
        articleDao.delete(1);
    }
}
