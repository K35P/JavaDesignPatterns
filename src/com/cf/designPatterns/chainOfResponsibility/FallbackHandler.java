package com.cf.designPatterns.chainOfResponsibility;

public class FallbackHandler extends Handler{
    @Override
    public void handleRequest(String request) {
        System.out.println("FallbackHandler log the unknown request " + "(" + request + ").");
    }
}
