package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

public abstract class AbstractVehicle implements Vehicle {

    public abstract String getEngine();

    public abstract String getColour();

    public abstract void paint(Colour colour);

}
