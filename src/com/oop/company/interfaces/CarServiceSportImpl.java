package com.oop.company.interfaces;

import com.oop.company.Car;
import com.oop.company.ElectricCar;

public class CarServiceSportImpl implements CarService {



    @Override
    public Car createCarDemo() {
        System.out.println("Creating sports Car");
        return new ElectricCar();
    }

    @Override
    public void destroyCar(Car car) {
        System.out.println("Destroying sports Car");

    }
}
