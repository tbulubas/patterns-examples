package com.tboptimus.patterns.patternsexamples.Creational.FactoryMethod.step3;

public class Client {

    public static void main(String[] args) {

        // Create a red sports car...

        Vehicle sporty = VehicleFactory.make(
                VehicleFactory.Category.CAR,
                VehicleFactory.DrivingStyle.POWERFUL,
                Vehicle.Colour.RED);

        System.out.println(sporty);
    }
}
