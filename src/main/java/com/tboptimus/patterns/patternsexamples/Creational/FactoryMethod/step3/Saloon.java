package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

public class Saloon extends AbstractCar {

    public Saloon(StandardEngine standardEngine) {

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
        return "Saloon{} " + super.toString();
    }
}
