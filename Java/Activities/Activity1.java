package org.Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car carName = new Car();
        carName.color = "Black";
        carName.transmission = "Manual";
        carName.make = 2024;
        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();
    }

}
