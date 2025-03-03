package com.codeus.demo.cyclic;

import com.codeus.winter.context.AnnotationApplicationContext;

public class CyclicDependencyDemo {

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.cyclic");
        context.getBean(ServiceA.class);
    }
}