package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public interface Van {

    default String getAutoType() {
        return "-Van-";
    }

}
