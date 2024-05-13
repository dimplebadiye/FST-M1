package org.activity;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("John");
        myList.add("Mary");
        myList.add("Sam");
        myList.add("Jenny");
        myList.add("Anna");

        for(String names: myList){
            System.out.println(names);
        }

        System.out.println("Third element in list: " + myList.get(2));

        System.out.println("Does list contain Jack?: " + myList.contains("Jack"));

        System.out.println("Size of list: " + myList.size());

        myList.remove("John");

        System.out.println("Size of list: " + myList.size());
    }
}
