package com.codeus.demo.qualifier;

import com.codeus.winter.annotation.Component;

@Component("custom")
public class ServiceA implements Service {
    @Override
    public String toString() {
        return "ServiceA{}";
    }
}
