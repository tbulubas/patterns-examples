package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base;

public interface Body {

    default String getType() {
        return "Body";
    }

    String getBodyParts();

}
