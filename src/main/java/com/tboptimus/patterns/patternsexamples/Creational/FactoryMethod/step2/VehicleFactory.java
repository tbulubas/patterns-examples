package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public abstract class VehicleFactory {

    public enum DrivingStyle {
        ECONOMICAL,
        MIDRANGE,
        POWERFUL
    }

    public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
        Vehicle v = selectVehicle(style);
        v.paint(colour);
        return v;
    }

    // This is the "factory method"
    protected abstract Vehicle selectVehicle(DrivingStyle style);

}

