package com.cf.designPatterns.factoryMethod;

public class ConcreteProductB implements Product{
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}
