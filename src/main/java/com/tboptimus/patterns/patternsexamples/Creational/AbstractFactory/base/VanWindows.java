package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class VanWindows implements Windows, Van {
    @Override
    public String getWindowParts() {
        return getAutoType() + getType();
    }
}
