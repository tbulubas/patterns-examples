package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

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
    public void paint(Colour colour) {

    }

    @Override
    public String toString() {
        return "BoxVan{} " + super.toString();
    }
}
