package com.oop.company;

// Creating objects
public class CarMain {

    public static void main(String[] args) {

        String car = "alfa romeo";
        Car carObj = new Car();

        Car carObj2 = new Car( "red", "honda", "civic", 1430.45, 5.4);

        carObj2.accelerate( 50);
        carObj2.weight = 1350.8; // we have changed the value oh wight
        System.out.println(carObj2);

        ElectricCar electricCar = new ElectricCar();

        electricCar.electricEngine = "Example of an engine";
        electricCar.color = "green";
        electricCar.manufacturer = "Honda";
        electricCar.model = "Civic";


        System.out.println(electricCar);

        ElectricCar electricCar2 = new ElectricCar("blue", "alfa", "romeo", 1500d, 4.99, "TXT2");

        System.out.println(electricCar2);

        electricCar2.accelerate(50);
        System.out.println(electricCar2);

    }
}
