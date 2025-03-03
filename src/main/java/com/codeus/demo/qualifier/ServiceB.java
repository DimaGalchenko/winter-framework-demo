package com.codeus.demo.qualifier;

import com.codeus.winter.annotation.Component;
import com.codeus.winter.annotation.Primary;

@Component
public class ServiceB implements Service {
    @Override
    public String toString() {
        return "ServiceB{}";
    }
}
