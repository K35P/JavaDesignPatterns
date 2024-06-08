package com.cf.designPatterns.abstractFactory;

public class Client {
    private Chair chair;
    private Sofa sofa;

    public Client(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void useFurniture(){
        chair.siteOn();
        sofa.lieOn();
    }

}
