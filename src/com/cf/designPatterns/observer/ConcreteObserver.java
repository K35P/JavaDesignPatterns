package com.cf.designPatterns.observer;

public class ConcreteObserver implements Observer{
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("State changed to: " + subject.getState());
    }
}
