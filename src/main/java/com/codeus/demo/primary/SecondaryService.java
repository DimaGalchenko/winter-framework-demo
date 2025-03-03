package com.codeus.demo.primary;

import com.codeus.winter.annotation.Component;
import com.codeus.winter.annotation.Primary;

@Primary
@Component
public class SecondaryService implements Service {
    @Override
    public String toString() {
        return "SecondaryService{}";
    }
}
