package com.codeus.demo.collection;

import com.codeus.winter.annotation.Component;

@Component
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("PayPal payment processing...");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.PAY_PAL;
    }
}
