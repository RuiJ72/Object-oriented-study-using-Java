package com.oop.company;

public abstract class Car {


    // Atributes -> Object Cracateristics
    String color;
    String manufacturer;
    String model;
    Double weight;
    Double high;
    Integer velocity = 0;

    // Empty constructor
    public Car(){
        // allows  to create an object without passing parameters
    }


    // Constructors -> methods that allow you creating objects of this class
    public Car(String color, String manufacturer, String model, Double weight, Double high){

        // assigning parameters from the outside to objects inside the class
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.high = high;
    }

    // Object Behavior
    public void  accelerate(Integer quantity){
        if  (quantity > 0 && quantity <= 120) // Limiting the velocity

        this.velocity += quantity;
    }

    // ToString method to print all parameter values
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", high=" + high +
                ", velocity=" + velocity +
                '}';
    }
}
