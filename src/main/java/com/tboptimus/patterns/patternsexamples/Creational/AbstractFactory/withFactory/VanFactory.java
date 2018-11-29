package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.withFactory;

import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.*;

public class VanFactory extends AbstractVehicleFactory {
    @Override
    public Body createBody() {
        return new VanBody();
    }

    @Override
    public Chassis createChassis() {
        return new VanChassis();
    }

    @Override
    public Windows createWindows() {
        return new VanWindows();
    }
}
