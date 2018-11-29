package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public abstract class AbstractVan extends AbstractVehicle {

    public abstract String getEngine();

    public abstract String getColour();

    public abstract void paint(Vehicle.Colour colour);

    @Override
    public String toString() {
        return "AbstractVan{} " + super.toString();
    }
}
