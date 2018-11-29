package com.tboptimus.patterns.patternsexamples.Creational.Singleton;

public enum SerialNumberGeneratorMulti {

    ENGINE, VEHICLE;
    private int count;

    public synchronized int getNextSerial() {
        return ++count;
    }
}
