package com.demo.listener;

import com.demo.config.redis.RedisContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

public class SpringMvcDemoListener extends ContextLoaderListener {

    @Override
    public final void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("hello world!");

//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                new String[] {
//                        "redis-connect.xml"
//                },
//                RedisContext.class
//        );
//
//        RedisTemplate redisTemplate = ctx.getBean(RedisTemplate.class);

        super.contextInitialized(servletContextEvent);
    }
}
