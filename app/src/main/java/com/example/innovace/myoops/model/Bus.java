package com.example.innovace.myoops.model;

/**
 * Created by innovace on 19/1/18.
 */

public class Bus extends Car {


    public Bus(String make, String model) {
        super(make, model);
    }

    @Override
    public void getCar() {
        super.getCar();
        System.out.println("bus name");

    }
}
