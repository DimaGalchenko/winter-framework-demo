package com.codeus.demo.cyclic;

import com.codeus.winter.annotation.Component;

@Component
public class ServiceA {
    private ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
