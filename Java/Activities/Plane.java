package org.Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){
        this.passengers = new ArrayList<>();
        this.maxPassengers = maxPassengers;
    }

    //add passengers to the array using the add() method
    public void onboard(String passenger){
        passengers.add(passenger);
    }

    //returns the current date and time
    public Date takeOff(){
        lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    //sets the value of lastTimeLanded to the current date and time. Also clear() the array.
    public void land(){
        lastTimeLanded = new Date();
        passengers.clear();
    }

    //returns the value of lastTimeLanded.
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    //returns the array of passengers.
    public List<String> getPassesngers(){
        return passengers;
    }

}
