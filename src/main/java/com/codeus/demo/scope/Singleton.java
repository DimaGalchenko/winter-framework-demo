package com.codeus.demo.scope;

import com.codeus.winter.annotation.Component;
import com.codeus.winter.annotation.PostConstruct;

@Component
public class Singleton {

    @PostConstruct
    public void setUp() {
        System.out.println("Post Construct");
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }
}
