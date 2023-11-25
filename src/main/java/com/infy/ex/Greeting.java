package com.infy.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Greeting {

    public void greet() {
        System.out.println("Greeting:: method");
    }

    @PostConstruct
    public void init() {
        System.out.println("init:: method");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destroy:: method");
    }
}
