package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step1;

public class Pickup extends AbstractVan {
    public Pickup(Engine engine) {
        super(engine);
    }

    @Override
    public Engine getEngine() {
        return null;
    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void paint() {

    }
}
