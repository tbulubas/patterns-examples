package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public class VanBody implements Body, Van {
    @Override
    public String getBodyParts() {
        return getAutoType() + getType();
    }
}
