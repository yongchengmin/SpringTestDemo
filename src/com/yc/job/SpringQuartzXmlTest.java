package com.yc.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQuartzXmlTest {

    public static void main(String[] args) {
        // 启动Spring 容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:applicationcontext.xml");
        System.out.println("initContext successfully");
    }
}