package com.hwua.springboot.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("容器初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
