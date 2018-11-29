package com.tboptimus.patterns.patternsexamples.Creational.Singleton;

public enum SerialNumberGenerator {

    INSTANCE;
    private int count;

    public synchronized int getNextSerial() {
        return ++count;
    }
}
