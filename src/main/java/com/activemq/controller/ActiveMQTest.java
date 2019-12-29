package com.activemq.controller;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class ActiveMQTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-mvc.xml");


    }
}
