package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public class Pickup extends AbstractVan {
    public Pickup(StandardEngine standardEngine) {

    }

    @Override
    public String getEngine() {
        return null;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public void paint(Vehicle.Colour colour) {

    }

    @Override
    public String toString() {
        return "Pickup{} " + super.toString();
    }
}
