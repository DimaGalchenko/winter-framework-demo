package com.codeus.demo.qualifier;

import com.codeus.winter.annotation.Component;
import com.codeus.winter.annotation.Qualifier;
import com.codeus.winter.context.AnnotationApplicationContext;

@Component
public class QualifierDemo {
    private final Service service;

    public QualifierDemo(@Qualifier("custom") Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.qualifier");

        QualifierDemo qualifierDemo = context.getBean(QualifierDemo.class);

        System.out.println(qualifierDemo.getService());
    }

    public Service getService() {
        return service;
    }
}
