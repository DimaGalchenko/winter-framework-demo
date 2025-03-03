package com.codeus.demo.collection;

import com.codeus.winter.annotation.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentProcessor {
    Map<PaymentType, PaymentStrategy> paymentStrategies;

    // Injection in List
    public PaymentProcessor(Set<PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies.stream()
                .collect(Collectors.toMap(PaymentStrategy::getType, Function.identity()));
    }

    public void pay(PaymentType paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(paymentType);
        if (paymentStrategy != null) {
            paymentStrategy.processPayment();
        }
    }
}
