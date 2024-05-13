package org.activity;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<Integer, String>();

        colours.put(1, "Orange");
        colours.put(2, "Yellow");
        colours.put(3, "White");
        colours.put(4, "Black");
        colours.put(5, "Gold");

        System.out.println("Map is: " + colours);

        colours.remove(5);

        System.out.println("Is green color present?: " + colours.containsValue("Green"));

        System.out.println("Size of Map: " + colours.size());
    }
}
