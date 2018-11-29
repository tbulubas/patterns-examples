package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step1;

public abstract class AbstractVehicle implements Vehicle {

    private Engine engine;
    private Vehicle.Colour colour;

    public AbstractVehicle(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
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

    public void paint(Vehicle.Colour colour) {
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
        return getClass().getSimpleName() + " (" + engine + ", + colour + ";
    }

}
