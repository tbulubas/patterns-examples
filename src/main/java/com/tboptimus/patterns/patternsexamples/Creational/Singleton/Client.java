package com.tboptimus.patterns.patternsexamples.Creational.Singleton;

public class Client {

    public static void main(String [] args) {

        System.out.println("Using traditional singleton");
        SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
        System.out.println("next serial: " + generator.getNextSerial());
        System.out.println("next serial: " + generator.getNextSerial());
        System.out.println("next serial: " + generator.getNextSerial());

        System.out.println("Using enum singleton");
        System.out.println("next vehicle: " + SerialNumberGenerator.INSTANCE.getNextSerial());
        System.out.println("next vehicle: " + SerialNumberGenerator.INSTANCE.getNextSerial());
        System.out.println("next engine: " + SerialNumberGenerator.INSTANCE.getNextSerial());

        System.out.println("Using enum singleton");
        System.out.println("next vehicle: " + SerialNumberGeneratorMulti.VEHICLE.getNextSerial());
        System.out.println("next vehicle: " + SerialNumberGeneratorMulti.VEHICLE.getNextSerial());
        System.out.println("next engine: " + SerialNumberGeneratorMulti.ENGINE.getNextSerial());
        System.out.println("next vehicle: " + SerialNumberGeneratorMulti.VEHICLE.getNextSerial());
        System.out.println("next engine: " + SerialNumberGeneratorMulti.ENGINE.getNextSerial());

        System.out.println("Using static block singleton");
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println("next engine: " + staticBlockSingleton.getNextSerial());
        System.out.println("next engine: " + staticBlockSingleton.getNextSerial());
        System.out.println("next engine: " + staticBlockSingleton.getNextSerial());

        System.out.println("Using private inner static class singleton");
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        System.out.println("next engine: " + billPughSingleton.getNextSerial());
        System.out.println("next engine: " + billPughSingleton.getNextSerial());
        System.out.println("next engine: " + billPughSingleton.getNextSerial());
    }
}
