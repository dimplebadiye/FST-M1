package org.Activities;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public void bicycleDesc(){
        System.out.println("Gears: " + gears);
        System.out.println("Seat Height: " + seatHeight);
        System.out.println("Current speed: " + currentSpeed);
    }
}
