package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

public class VanFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {

        if ((style == DrivingStyle.ECONOMICAL) ||
                (style == DrivingStyle.MIDRANGE)) {
            return new Pickup(new StandardEngine(2200));
        } else {
            return new BoxVan(new TurboEngine(2500));
        }

    }

}
