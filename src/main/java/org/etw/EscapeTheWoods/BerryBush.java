/**
 * Class: BerryBush
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: November 12, 2024
 * 
 * Purpose: A room of the scenerio where the player finds a berry bush,
 * and can choose to eat from it or not.
 */

package org.etw.EscapeTheWoods;

public class BerryBush extends Room {
    
    // Constructor
    public BerryBush(double difficulty,String description, String roomName) {
        super(1, "You have found a berry bush.", "Berry Bush");
    }

    public String determineColor() {
        String color;
        int option = (int) Math.random();
        switch(option) {
            case 1:
            color = "red";
            return color;
            case 2:
            color = "blue";
            return color;
            case 3:
            color = "white";
            return color;
            default:

        }
    }

}
