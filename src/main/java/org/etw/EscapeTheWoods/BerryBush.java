/**
 * Class: BerryBush
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Fall 2024
 * Written: November 12, 2024
 * 
 * Purpose: A room of the scenerio where the player finds a berry bush,
 * and can choose to eat from it or not.
 */

package org.etw.EscapeTheWoods;

import java.util.Random;

public class BerryBush extends Room {
    
    // Constructor
    public BerryBush(double difficulty,String description, String roomName) {
        super(1, "You have found a berry bush.", "Berry Bush");
    }

    /**
     * Method that determines the color of berries
     * which effects if the berries are safe to eat or not
     * 
     * 
     * @return color;
     */
    public String determineColor() {
        String color = "";
        Random rand = new Random();
        int option = rand.nextInt(3);
        switch(option) {
            case 1:
                // safe gives more than blue though
                color = "red";
                break;
            case 2:
                // safe
                color = "blue";
                break;
            case 3:
                // isn't safe
                color = "white";
                break;
            default:
                break;
        }

        return color;
    }

    public boolean isEdible(){
        if (determineColor().equalsIgnoreCase("red") || determineColor().equalsIgnoreCase("blue") ) {
            return true;
        }
        else {
            return false;
        }
    }

}
