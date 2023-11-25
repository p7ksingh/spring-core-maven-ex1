package com.infy.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("springconfig.xml");
        Greeting greet = app.getBean("greeting", Greeting.class);
        greet.greet();
    }
}
