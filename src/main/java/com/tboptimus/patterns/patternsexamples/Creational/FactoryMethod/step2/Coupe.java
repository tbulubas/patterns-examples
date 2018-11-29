package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public class Coupe extends AbstractCar {
    public Coupe(StandardEngine standardEngine) {

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
        return "Coupe{} " + super.toString();
    }
}
