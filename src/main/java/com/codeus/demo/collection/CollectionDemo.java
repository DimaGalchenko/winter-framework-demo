package com.codeus.demo.collection;

import com.codeus.winter.annotation.Component;
import com.codeus.winter.context.AnnotationApplicationContext;

import java.util.Map;

@Component
public class CollectionDemo {

    public CollectionDemo(Map<String, PaymentStrategy> paymentStrategyMap) {
        System.out.println(paymentStrategyMap);
    }

    public static void main(String[] args) {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.codeus.demo.collection");
        PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
        paymentProcessor.pay(PaymentType.PAY_PAL);
        paymentProcessor.pay(PaymentType.CREDIT_CARD);

        context.getBean(CollectionDemo.class);
    }
}
