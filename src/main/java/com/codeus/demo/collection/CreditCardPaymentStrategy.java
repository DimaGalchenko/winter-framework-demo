package com.codeus.demo.collection;

import com.codeus.winter.annotation.Component;

@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Credit card payment processing...");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CREDIT_CARD;
    }
}
