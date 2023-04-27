package com.oop.company;


// Inheritance for the Cass Car
public class ElectricCar extends Car{

    String electricEngine;

    // Constructor -> Empty
    public ElectricCar() {

    }

    // Constructor With Parameters
    public ElectricCar(String electricEngine) {
       this.electricEngine = electricEngine;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", high=" + high +
                ", velocity=" + velocity +
                ", electricEngine='" + electricEngine + '\'' +
                '}';
    }
}
