package com.codeus.demo.autowired;

import com.codeus.winter.annotation.Autowired;
import com.codeus.winter.annotation.Component;

@Component
public class Service {
    @Autowired
    private FirstDependency firstDependency;
    private SecondDependency secondDependency;
    private ThirdDependency thirdDependency;

    @Autowired
    public Service(ThirdDependency thirdDependency) {
        this.thirdDependency = thirdDependency;
    }

    public Service() {
    }

    @Autowired
    public void setSecondDependency(SecondDependency secondDependency) {
        this.secondDependency = secondDependency;
    }

    @Override
    public String toString() {
        return "Service{" +
                "firstDependency=" + firstDependency +
                ", secondDependency=" + secondDependency +
                ", thirdDependency=" + thirdDependency +
                '}';
    }
}
