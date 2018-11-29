package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step1;

public abstract class AbstractVan extends AbstractVehicle {

    public AbstractVan(Engine engine) {
        super(engine);
    }

    public abstract Engine getEngine();

    public abstract Colour getColour();

    public abstract void paint();
}
