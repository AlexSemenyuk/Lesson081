package org.itstep.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import org.itstep.service.PostService;
import org.itstep.service.UserService;

public abstract class BaseServlet extends HttpServlet {
    protected UserService userService;
    protected PostService postService;
    //    protected BlogDao blogDao;
//    protected PostDao postDao;
//    protected UserDao userDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String url = "jdbc:mariadb://localhost/myblog";
        String username = "root";
        String password = "";
//        taskDao = new TaskDaoImpl(url, username, password);
//        blogDao = new BlogDaoImpl("jdbc:mariadb://localhost/myblog", "root", "");
//        userDao = new UserDaoImpl(url, username, password);
//        postDao = new PostDaoImpl(url, username, password);
        userService = new UserService();
        postService = new PostService();
    }
}




