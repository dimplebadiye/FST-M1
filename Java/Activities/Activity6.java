package org.Activities;

public class Activity6 {

    public static void main(String[] args) throws Throwable {

        Plane plane = new Plane(10);

        plane.onboard("John");
        plane.onboard("Jack");
        plane.onboard("Jenny");
        plane.onboard("Sam");
        plane.onboard("Mary");
        plane.onboard("Anna");

        System.out.println("Take off time: " + plane.takeOff());

        System.out.println("Passengers List: " + plane.getPassesngers());

        Thread.sleep(5000);

        plane.land();

        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    }
}
