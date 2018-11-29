package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public interface Windows {

    default String getType() {
        return "Windows";
    }

    String getWindowParts();

}
