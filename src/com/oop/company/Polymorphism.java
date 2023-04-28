package com.oop.company;

public class Polymorphism {

    public static void main(String[] args) {

        // common way in which we create objects
        Car car1 = new ElectricCar();

        ElectricCar car2 = new ElectricCar();

        HybridCar car3 = new HybridCar();

        /*But when we have inherited classes what
         we will have to apply is polymorphism = multiple instances.
         This is a higher level of abstraction to work with, in this case with
         the object Car */


        // Base types on the left
        Car car4 = new ElectricCar();
        Car car5 = new HybridCar();

        /* checking whether these objects
        are instances of the respective classes
        using instance of
         */


        if (car4 instanceof ElectricCar){
            System.out.println("This is an electric car");
        }

        if (car4 instanceof HybridCar){
            System.out.println("This is a Hybrid");
        }



    }
}
