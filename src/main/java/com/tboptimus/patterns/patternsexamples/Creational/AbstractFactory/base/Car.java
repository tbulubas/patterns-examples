package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public interface Car {

    default String getAutoType() {
        return "-Car-";
    }
}
