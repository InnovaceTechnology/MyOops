package com.example.innovace.myoops.shapes;

/**
 * Created by innovace on 19/1/18.
 */

public class Rectangle extends Shape {


    @Override
    public void calculateArea(int length, int width) {

        this.area = length * width;

        super.calculateArea();
    }



}
