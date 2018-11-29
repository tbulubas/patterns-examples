package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step1;

public class Sport extends AbstractCar {
    public Sport(Engine engine) {
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
