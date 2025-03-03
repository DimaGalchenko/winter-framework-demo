package com.codeus.demo.primary;


import com.codeus.winter.annotation.Component;
import com.codeus.winter.annotation.Qualifier;
import com.codeus.winter.context.AnnotationApplicationContext;

@Component
public class PrimaryDemo {
    private final Service service;

    public PrimaryDemo(/*@Qualifier("primaryService")*/ Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.primary");
        PrimaryDemo primaryDemo = context.getBean(PrimaryDemo.class);
        System.out.println(primaryDemo.getService());
    }

    public Service getService() {
        return service;
    }
}
