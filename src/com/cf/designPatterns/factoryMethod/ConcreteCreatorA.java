package com.cf.designPatterns.factoryMethod;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
