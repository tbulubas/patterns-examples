package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step2;

public abstract class AbstractVehicle implements Vehicle {

    private Engine engine;
    private Colour colour;

    public AbstractVehicle(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    public AbstractVehicle(Engine engine, Colour colour) {
        this.engine = engine;
        this.colour = colour;
        // ... followed by lots of time-consuming stuff
    }

    public Engine getEngine() {
        return engine;
    }

    public Colour getColour() {
        return colour;
    }

    public void paint(Colour colour) {
        this.colour = colour;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException x) {
            // Should not happen...
        }
        return obj;
    }

    public String toString() {
        return getClass().getSimpleName() + " (" + engine + ", " + colour + " )";
    }

}
