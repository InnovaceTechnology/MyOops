package com.example.innovace.myoops.shapes;

/**
 * Created by innovace on 19/1/18.
 */

public class Triangle extends Shape {

    @Override
    public void calculateArea(int base, int hight) {
        this.area = (base * hight)/2;
        super.calculateArea();
    }
}
