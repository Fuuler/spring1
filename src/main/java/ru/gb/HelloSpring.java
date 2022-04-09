package ru.gb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
       MessageRender messageRender = context.getBean("render", MessageRender.class);
        messageRender.reader();
    }
}
