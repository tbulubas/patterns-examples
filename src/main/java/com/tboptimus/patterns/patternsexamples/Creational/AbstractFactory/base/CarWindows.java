package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class CarWindows implements Windows, Car {
    @Override
    public String getWindowParts() {
        return getAutoType() + getType();
    }
}
