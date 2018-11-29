package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

public interface Vehicle {

    String getEngine();

    String getColour();

    void paint(Vehicle.Colour colour);

    public enum Colour {
        BLUE, WHITE, RED;
    }

}
