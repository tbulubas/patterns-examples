package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.withFactory;

import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Body;
import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Chassis;
import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.Windows;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        AbstractVehicleFactory factory = null;

        for (String type : Arrays.asList("car", "van")) {
            System.out.println(type);
            switch (type) {

                case "car":
                    // I am picking up the factory actively!
                    // 1 line
                    factory = new CarFactory();
                    break;

                default:
                case "van":
                    // I am picking up the factory actively!
                    // 1 line
                    factory = new VanFactory();
            }

            Body body = factory.createBody();
            Chassis chassis = factory.createChassis();
            Windows windows = factory.createWindows();

            System.out.println(body.getBodyParts());
            System.out.println(chassis.getChassisParts());
            System.out.println(windows.getWindowParts());
        }
    }

}
