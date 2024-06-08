package com.cf.designPatterns.builder;

public class ConcreteHouseBuilder implements HouseBuilder{
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
        System.out.println("Foundation complete.");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete structure");
        System.out.println("Structure complete.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete roof");
        System.out.println("Roof complete.");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden interior");
        System.out.println("Interior complete.");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
