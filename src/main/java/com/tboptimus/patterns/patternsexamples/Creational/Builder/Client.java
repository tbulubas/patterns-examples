package com.tboptimus.patterns.patternsexamples.Creational.Builder;

import com.tboptimus.patterns.patternsexamples.Creational.Builder.basic.*;
import com.tboptimus.patterns.patternsexamples.Creational.Builder.director.CarDirector;
import com.tboptimus.patterns.patternsexamples.Creational.Builder.director.VanDirector;
import com.tboptimus.patterns.patternsexamples.Creational.Builder.director.VehicleDirector;

public class Client {

    public static void main(String [] args) {

        AbstractCar car = new Saloon(new StandardEngine(1300));
        VehicleBuilder builder = new CarBuilder(car);
        VehicleDirector director = new CarDirector();
        Vehicle v = director.build(builder);
        System.out.println(v);

        AbstractVan van = new Saloon2(new StandardEngine(2300));
        VehicleBuilder builder2 = new VanBuilder(van);
        VehicleDirector director2 = new VanDirector();
        Vehicle v2 = director2.build(builder2);
        System.out.println(v2);

    }

}
