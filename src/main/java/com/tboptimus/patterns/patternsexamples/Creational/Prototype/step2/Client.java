package com.tboptimus.patterns.patternsexamples.Creational.Prototype.step2;

public class Client {

    public static void main(String[] args) {
//
//        VehicleManager manager = new VehicleManager();
//        Vehicle saloon1 = manager.createSaloon();
//        Vehicle saloon2 = manager.createSaloon();
//        Vehicle pickup1 = manager.createPickup();
//
//        System.out.println(saloon1);
//        System.out.println(saloon2);
//        System.out.println(pickup1);


        VehicleManagerLazy manager2 = new VehicleManagerLazy();
        Vehicle saloon21 = manager2.createSaloon();
        Vehicle saloon22 = manager2.createSaloon();
        Vehicle pickup21 = manager2.createPickup();

        System.out.println(saloon21);
        System.out.println(saloon22);
        System.out.println(pickup21);
    }

}
