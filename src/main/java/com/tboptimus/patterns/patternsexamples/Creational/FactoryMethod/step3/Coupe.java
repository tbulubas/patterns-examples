package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

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
    public void paint(Colour colour) {

    }

    @Override
    public String toString() {
        return "Coupe{} " + super.toString();
    }
}
