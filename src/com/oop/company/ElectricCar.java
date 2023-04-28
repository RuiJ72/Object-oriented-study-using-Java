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
    // Contructor overload
    public ElectricCar(String color, String manufacturer, String model, Double weight, Double high, String electricEngine){
        // method Super -> allows  to evoke a superior class
        super(color, manufacturer, model, weight, high); // evoking the higher class
        this.electricEngine = electricEngine;
    }

    // subscribing a method
    @Override
    public void accelerate(Integer quantity){
        Integer quantityAdjusted = quantity * 2;
        //super.accelerate(quantity); // invoking the original code that is located in the parent class
        super.accelerate(quantityAdjusted);
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
