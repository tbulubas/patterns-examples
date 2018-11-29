package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step2;

public class CarFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {

        if (style == DrivingStyle.ECONOMICAL) {
            return new Saloon(new StandardEngine(1300));

        } else if (style == DrivingStyle.MIDRANGE) {
            return new Coupe(new StandardEngine(1600));
        } else {
            return new Sport(new TurboEngine(2000));
        }

    }

}
