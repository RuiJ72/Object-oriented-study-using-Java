package com.oop.company.interfaces;

import com.oop.company.Car;

public interface CarService {

    /* An interface defines methods that other classes will have to implement.
       An interface is like a contract that you
       have to make and it is the class that implements it
     */

     public Car createCarDemo(); // Creating a method but without a body

     public void destroyCar(Car car); // Destroying a method



}
