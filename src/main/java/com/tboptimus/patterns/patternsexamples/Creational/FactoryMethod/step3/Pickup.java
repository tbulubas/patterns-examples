package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

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
    public void paint(Colour colour) {

    }

    @Override
    public String toString() {
        return "Pickup{} " + super.toString();
    }
}
