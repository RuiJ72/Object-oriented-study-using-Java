package com.oop.company.interfaces;

import com.oop.company.Car;

public class InterfacesMain {

    public static void main(String[] args) {

        // Polymorphism concept on Interfaces

        CarService service = new CarServiceSportImpl();

        Car car = service.createCarDemo();




    }
}
