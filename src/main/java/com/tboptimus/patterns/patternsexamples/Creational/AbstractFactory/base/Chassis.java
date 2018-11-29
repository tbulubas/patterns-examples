package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public interface Chassis {

    default String getType() {
        return "Chassis";
    }

    String getChassisParts();

}
