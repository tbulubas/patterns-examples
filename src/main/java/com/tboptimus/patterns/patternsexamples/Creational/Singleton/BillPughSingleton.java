package com.tboptimus.patterns.patternsexamples.Creational.Singleton;

public class BillPughSingleton {

    private int count;

    public synchronized int getNextSerial() {
        return SingletonHelper.INSTANCE.count++;
    }

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
