package com.tboptimus.patterns.patternsexamples.Creational.Builder.basic;

public class CarBuilder extends VehicleBuilder {

    private AbstractCar carInProgress;

    public CarBuilder(AbstractCar car) {
        this.carInProgress = car;
    }

    public void buildBody() {
        System.out.println("body");
    }

    public void buildBoot() {
        System.out.println("boot");
    }

    public void buildChassis() {
        System.out.println("chassis");
    }

    public void buildPassengerArea() {
        System.out.println("passarea");
    }

    public void buildWindows() {
        System.out.println("windows");
    }

    @Override
    public Vehicle getVehicle() {
        return carInProgress;
    }
}
