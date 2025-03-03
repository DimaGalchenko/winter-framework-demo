package com.codeus.demo.cyclic;

import com.codeus.winter.annotation.Component;

@Component
public class ServiceC {
    private ServiceA serviceA;

    public ServiceC(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
