package com.example.innovace.myoops.model;

/**
 * Created by innovace on 19/1/18.
 */

public class Car {
    private  String make;
    private  String model;
    private  int meter = 0;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        if (meter > 0){

            this.meter = meter;

        }
    }

    public void getCar(){

        System.out.println("make name"+this.make+" "+"model name" +this.model);

    }

    public  void printDetails(){
        System.out.println("make name"+this.make+" "+"model name" +this.model);
    }

    public  void meter(int milesTometre){
        if (milesTometre > 0){
            this.meter += milesTometre;
        }

    }
}
