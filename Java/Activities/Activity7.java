package org.activity7;

public class Activity7 {

    public static void main(String[] args){
        MountainBike mb = new MountainBike(3, 0, 25);
        mb.bicycleDesc();
        mb.speedUp(20);
        mb.applyBrake(5);
        mb.bicycleDesc();
    }
}
