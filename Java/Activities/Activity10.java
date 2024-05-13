package org.activity;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args){

        HashSet hs = new HashSet<>();
        hs.add("Tree");
        hs.add("Plants");
        hs.add("Fertilizer");
        hs.add("Soil");
        hs.add("Water");
        hs.add("Weather");

        System.out.println("Size of set: " + hs.size());

        hs.remove("Weather");

        if(hs.remove("Cactus")) {
            System.out.println("Cactus removed from the Set");
        } else {
            System.out.println("Cactus is not present in the Set");
        }

        System.out.println("Is weather present in set: " + hs.contains("Weather"));

        System.out.println("Updated set: " + hs);
    }
}
