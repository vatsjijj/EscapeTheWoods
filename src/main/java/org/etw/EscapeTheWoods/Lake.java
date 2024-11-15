/**
 * Class: Lake
 * @author Gerry Bennett
 * @version 1.0
 * Course: CSE201
 * Written 12 Nov 2024
 * 
 * Purpose: A room where the player finds a lake, and can choose whether to explore the area, fish, or leave.
 */
package org.etw.EscapeTheWoods;
import java.util.Random;
import java.util.Scanner;

public class Lake extends Room {

    //Constructor
    public Lake (double difficulty,String description, String roomName) {
        super(1, "You have found a lake.", "Lake");
    }

    /**
     * Method that gives the player the choice to 
     * either fish or explore.
     * @param choice A scanner than takes the user's input
     */
    public void askPlayer(Scanner choice){ 
        String userChoice = "";
        System.out.println("Would you like to fish or explore?");
        userChoice = choice.nextLine();
        if (userChoice.equalsIgnoreCase("fish")) {
            catchFish();
        } else if (userChoice.equalsIgnoreCase("explore")) {
            // To be Implemented 
            exploreLake();
        }
    }

    /**
     * Method that represents the player fishing. The player has a
     * 40% chance of catching a fish. 
     * @return false if they don't catch a fish, true if they do
     */
    public boolean catchFish(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 40){
            //Player does not catch fish
            return false;
        } else {
            //Player catches fish
            return true;
        }
    }

    /**
     * Player looks around the lake for potential items.
     * There is a 20% chance of finding an item.
     * @return false if they don't find an item, true if they do
     */
    public boolean exploreLake() {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 20) {
            // Player does not find item
            return false;
        } else {
            // Player finds item
            return true;
        }
    }
}
