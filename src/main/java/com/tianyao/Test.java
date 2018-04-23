package com.tianyao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Object dataSource = ioc.getBean("dataSource");
        System.out.println(dataSource);
    }
}
