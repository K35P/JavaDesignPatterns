package com.cf.designPatterns.chainOfResponsibility;

public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("Request1")){
            System.out.println("ConcreteHandler1 handled the request.");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
