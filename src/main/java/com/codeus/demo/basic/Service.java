package com.codeus.demo.basic;


import com.codeus.winter.annotation.Component;

@Component
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void process() {
        System.out.println("Processing in service...");
        repository.save(new Entity(1L, "EntityName"));
    }
}
