package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public class BoxVan extends AbstractVan {
    public BoxVan(TurboEngine turboEngine) {

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
        return "BoxVan{} " + super.toString();
    }
}
