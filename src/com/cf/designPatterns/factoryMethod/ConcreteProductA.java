package com.cf.designPatterns.factoryMethod;

public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}
