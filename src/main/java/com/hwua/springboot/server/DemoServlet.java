package com.hwua.springboot.server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoServlet extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到了DemoServlet");
        resp.getWriter().write("Hello DemoSefvlet");
        resp.getWriter().close();
    }
}
