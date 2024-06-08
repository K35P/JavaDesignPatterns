package com.cf.designPatterns.composite;

import java.util.ArrayList;

public class CompositeGraphic implements Graphic{
    private ArrayList<Graphic> children = new ArrayList<>();

    @Override
    public void draw() {
        for(Graphic graphic : children){
            graphic.draw();
        }
    }

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }

}
