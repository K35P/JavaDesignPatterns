package com.cf.designPatterns.chainOfResponsibility;

public class ConcreteHandler3 extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("Request3")){
            System.out.println("ConcreteHandler3 handled the request.");
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
