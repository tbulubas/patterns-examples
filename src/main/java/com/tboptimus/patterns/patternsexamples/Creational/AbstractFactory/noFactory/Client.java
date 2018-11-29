package com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.noFactory;


import com.tboptimus.patterns.patternsexamples.Creational.AbstractFactory.base.*;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        String bodyParts=null;
        String chassisParts=null;
        String windowsParts=null;

        Body body = null;
        Chassis chassis = null;
        Windows windows = null;

        for (String type : Arrays.asList("car", "van")) {
            System.out.println(type);
            switch (type) {

                case "car":
                    // 3 lines
                    body = new CarBody();
                    chassis = new CarChassis();
                    windows = new CarWindows();
                    break;

                default:
                case "van":
                    // 3 lines
                    body = new VanBody();
                    chassis = new VanChassis();
                    windows = new VanWindows();
            }

            System.out.println(body.getBodyParts());
            System.out.println(chassis.getChassisParts());
            System.out.println(windows.getWindowParts());
        }
    }

}
