package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class CarBody implements Body, Car {
    @Override
    public String getBodyParts() {
        return getAutoType() + getType();
    }
}
