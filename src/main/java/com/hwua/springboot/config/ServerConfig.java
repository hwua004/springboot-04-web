package com.hwua.springboot.config;

import com.hwua.springboot.server.DemoFilter;
import com.hwua.springboot.server.DemoListener;
import com.hwua.springboot.server.DemoServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ServerConfig {


    @Bean
    public ServletRegistrationBean getMyServlet(){
        ServletRegistrationBean bean=
                new ServletRegistrationBean(new DemoServlet(),"/demoServlet","/abc");
        return bean;
    }
    @Bean
    public FilterRegistrationBean getMyFilter(){
        FilterRegistrationBean bean= new FilterRegistrationBean();
        bean.setFilter(new DemoFilter());
        bean.setUrlPatterns(Arrays.asList("/demoServlet"));
        return bean;
    }
    @Bean
    public ServletListenerRegistrationBean getMyListener(){
        ServletListenerRegistrationBean bean= new ServletListenerRegistrationBean();
        bean.setListener(new DemoListener());
        return bean;
    }

}
