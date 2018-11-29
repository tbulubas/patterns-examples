package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step2;

public class Coupe extends AbstractCar {

    public Coupe(Engine engine) {
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
