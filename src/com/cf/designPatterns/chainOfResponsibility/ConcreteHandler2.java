package com.cf.designPatterns.chainOfResponsibility;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("Request2")){
            System.out.println("ConcreteHandler2 handled the request.");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
