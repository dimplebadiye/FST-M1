package org.activity1;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }

    //This displays the values of all the variables
    public void displayCharacteristics() {
        System.out.println("Car color is: " + color);
        System.out.println("Car transmission is: " + transmission);
        System.out.println("Car make is: " + make);
        System.out.println("Car tyres is: " + tyres);
        System.out.println("Car doors is: " + doors);
    }

    //This prints "Car is moving forward."
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    //This prints "Car has stopped."
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
