package com.cf.designPatterns.abstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void siteOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}
