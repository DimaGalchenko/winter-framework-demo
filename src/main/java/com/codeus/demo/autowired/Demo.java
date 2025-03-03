package com.codeus.demo.autowired;

import com.codeus.winter.context.AnnotationApplicationContext;

public class Demo {

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.autowired");
        System.out.println(context.getBean(Service.class));
    }
}
