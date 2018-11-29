package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class VanChassis implements Chassis, Van {
    @Override
    public String getChassisParts() {
        return getAutoType() + getType();
    }
}
