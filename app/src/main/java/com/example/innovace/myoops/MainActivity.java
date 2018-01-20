package com.example.innovace.myoops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.innovace.myoops.model.Bus;
import com.example.innovace.myoops.model.Car;
import com.example.innovace.myoops.model.Data;
import com.example.innovace.myoops.model.Vechile;
import com.example.innovace.myoops.shapes.Rectangle;
import com.example.innovace.myoops.shapes.Triangle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data data = new Data("AAA","bbb",20);
        data.dataFuction();

        Car car = new Car("honda","bike");
        car.getCar();

        Vechile vechile = new Vechile("swift","car");
        Bus bus = new Bus("yellow","bus");

        vechile.meter(-100);
        vechile.meter(500);
        System.out.println("car value" + vechile.getMeter());

        bus.getCar();
        car.getCar();

        car.printDetails();
        vechile.printDetails();


        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5,6);


        Triangle triangle = new Triangle();
        triangle.calculateArea(5,8);

    }
}
