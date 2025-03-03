package com.codeus.demo.cyclic;

import com.codeus.winter.annotation.Component;

@Component
public class ServiceB {
    private ServiceC serviceC;

    public ServiceB(ServiceC serviceC) {
        this.serviceC = serviceC;
    }
}
