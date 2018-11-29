package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class CarChassis implements Chassis, Car{
    @Override
    public String getChassisParts() {
        return getAutoType() + getType();
    }

}
