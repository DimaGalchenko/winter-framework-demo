package com.codeus.demo.basic;

import com.codeus.winter.annotation.Component;

@Component
public class Repository {

    public void save(Entity entity) {
        System.out.println("Saving entity " + entity);
    }
}
