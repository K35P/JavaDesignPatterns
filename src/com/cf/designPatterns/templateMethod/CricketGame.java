package com.cf.designPatterns.templateMethod;

public class CricketGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initializing Cricket Game...");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game is started.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game is ended.");
    }
}
