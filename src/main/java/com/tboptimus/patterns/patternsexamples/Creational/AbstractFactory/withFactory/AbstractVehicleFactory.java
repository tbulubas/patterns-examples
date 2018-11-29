package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.withFactory;

import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Body;
import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Chassis;
import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Windows;

public abstract class AbstractVehicleFactory {

    public abstract Body createBody();

    public abstract Chassis createChassis();

    public abstract Windows createWindows();

}
