package com.oop.company.interfaces;

import com.oop.company.Car;
import com.oop.company.ElectricCar;

public class CarServiceClassicImpl implements CarService {

    // This class implements the respective Interface
    @Override
    public Car createCarDemo() {
        System.out.println("Creating classic Car");
        return new ElectricCar();
    }

    @Override
    public void destroyCar(Car car) {
        System.out.println("Destroying car");


    }
}
