package com.tboptimus.patterns.patternsexamples.Creational.Singleton;

public class StaticBlockSingleton {

    private int count;

    private static StaticBlockSingleton instance;

    public synchronized int getNextSerial() {
        return instance.count++;
    }

    private StaticBlockSingleton() {
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
