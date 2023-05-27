package org.itstep.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import org.itstep.service.PostService;
import org.itstep.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BaseServlet extends HttpServlet {
    protected UserService userService;
    protected PostService postService;


    @Override
    public void init(ServletConfig config) throws ServletException {

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        userService = context.getBean("UserService", UserService.class);
//        postService = context.getBean("PostService", PostService.class);

        userService = new UserService();
        postService = new PostService();
    }
}




