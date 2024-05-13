package org.activity7;

public class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    //reduces the currentSpeed by the number passed to the method.
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    //increases the currentSpeed by the number passed to the method.
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    //It prints the number of gears and the currentSpeed of the bicycle
    public void bicycleDesc(){
        System.out.println("Gears: " + gears);
        System.out.println("Current speed: " + currentSpeed);
    }

}
