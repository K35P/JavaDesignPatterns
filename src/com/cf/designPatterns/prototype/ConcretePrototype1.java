package com.cf.designPatterns.prototype;

public class ConcretePrototype1 implements Prototype{
    private String field;

    public ConcretePrototype1(String field){
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1 [field=" + field + "]";
    }
}
