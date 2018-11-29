package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public class Sport extends AbstractCar {
    public Sport(TurboEngine turboEngine) {

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
        return "Sport{} " + super.toString();
    }
}
