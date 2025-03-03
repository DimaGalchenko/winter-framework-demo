package com.codeus.demo.collection;

public interface PaymentStrategy {
    void processPayment();
    PaymentType getType();
}
