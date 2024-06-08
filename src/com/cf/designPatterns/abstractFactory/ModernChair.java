package com.cf.designPatterns.abstractFactory;

public class ModernChair implements Chair{
    @Override
    public void siteOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}
