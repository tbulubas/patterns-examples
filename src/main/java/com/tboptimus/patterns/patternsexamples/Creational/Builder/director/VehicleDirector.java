package com.tboptimus.patterns.patternsexamples.Creational.Builder.director;

import com.tboptimus.patterns.patternsexamples.Creational.Builder.basic.Vehicle;
import com.tboptimus.patterns.patternsexamples.Creational.Builder.basic.VehicleBuilder;

public abstract class VehicleDirector {

    public abstract Vehicle build(VehicleBuilder builder);

}
