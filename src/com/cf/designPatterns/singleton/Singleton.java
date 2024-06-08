package com.cf.designPatterns.singleton;

public class Singleton {
    private static Singleton istance;

    private Singleton(){
    }

    public static Singleton getIstance(){
        if(istance == null){
            istance = new Singleton();
        }
        return istance;
    }
}
