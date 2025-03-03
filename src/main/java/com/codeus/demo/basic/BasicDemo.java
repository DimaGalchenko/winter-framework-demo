package com.codeus.demo.basic;

import com.codeus.winter.context.AnnotationApplicationContext;

public class BasicDemo {
    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.basic");
        Service service = context.getBean(Service.class);
        service.process();
    }
}
