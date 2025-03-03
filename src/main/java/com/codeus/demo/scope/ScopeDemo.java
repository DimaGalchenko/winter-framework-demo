package com.codeus.demo.scope;


import com.codeus.winter.context.AnnotationApplicationContext;

public class ScopeDemo {
    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.scope");

        // Prototype
        Session session1 = context.getBean(Session.class);
        Session session2 = context.getBean(Session.class);

        System.out.println("session1 == session2 = " + (session1 == session2));
        System.out.println("seesion1 hash code: " + session1.hashCode());
        System.out.println("seesion2 hash code: " + session2.hashCode());

        System.out.println("----------------------------------------------");
        System.out.println("______________________________________________");

        // Singleton
        System.out.println(context.getBean(Singleton.class));
        Singleton singleton1 = context.getBean(Singleton.class);
        Singleton singleton2 = context.getBean(Singleton.class);

        System.out.println("singleton1 == singleton2 = " + (singleton1 == singleton2));
    }
}
