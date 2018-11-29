package com.tboptimus.patterns.patternsexamples.Creational.Builder.basic;

public class VanBuilder extends VehicleBuilder {

    private AbstractVan vanInProgress;

    public VanBuilder(AbstractVan car) {
        this.vanInProgress = car;
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

    public void buildReinforcedStorageArea() {
        System.out.println("buildReinforcedStorageArea");
    }
    
    public void buildWindows() {
        System.out.println("windows");
    }

    @Override
    public Vehicle getVehicle() {
        return vanInProgress;
    }
}
