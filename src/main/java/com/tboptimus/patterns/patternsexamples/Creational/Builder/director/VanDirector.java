package com.tboptimus.patterns.patternsexamples.Creational.Builder.director;

import com.tboptimus.patterns.patternsexamples.Creational.Builder.basic.Vehicle;
import com.tboptimus.patterns.patternsexamples.Creational.Builder.basic.VehicleBuilder;

public class VanDirector extends VehicleDirector {

    @Override
    public Vehicle build(VehicleBuilder builder) {

        builder.buildChassis();
        builder.buildBody();
        builder.buildReinforcedStorageArea();
        builder.buildWindows();

        return builder.getVehicle();
    }

}
