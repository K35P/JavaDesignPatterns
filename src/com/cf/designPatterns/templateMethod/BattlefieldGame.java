package com.cf.designPatterns.templateMethod;

public class BattlefieldGame extends Game{

    @Override
    protected void initialize() {
        System.out.println("Battlefield is initializing...");
    }

    @Override
    protected void startPlay() {
        System.out.println("Battlefield is started. Join the battle!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Battlefield is ended.");
    }
}
