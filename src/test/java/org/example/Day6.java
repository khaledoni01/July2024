package org.example;

public class Day6 {

//2. Write a nested if where country is equal to USA, else print -> no
//    language.
//            Nested if should have below conditions
//if state is equal to NY -> print “You’re a survivor”
//            else if state is equal to NJ -> print “You’re a peach lover”

    public static void main(String[] args) {

        String state = "CA";

            switch (state) {

                case "NJ":
                    System.out.println("You're a peach lover");
                    break;
                default:
                    System.out.println("No state found!");
            }

    }
}
