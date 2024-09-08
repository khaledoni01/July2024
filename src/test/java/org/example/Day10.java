package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day10 {

//    i. Create a HashMap with 2 values
//    ii. Loop through the HashMap to print values only using keys
//    Note: Don’t use values() method

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("England", "London");
        map.put("USA", "W. D.C");

        for( String k : map.keySet()) {
            System.out.println(map.get(k));
        }

    }
}
