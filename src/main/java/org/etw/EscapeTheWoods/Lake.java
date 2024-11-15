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
     * give player a choice
     * 
     * @param choice
     * 
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

    /*
     * catchFish method
     * 
     * @return boolean fish
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

    /*
     * exploreLake method
     * 
     * @return boolean item
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


/**
 * Method to simulate searching for an item.
 * The probability of finding an item is determined by a random number,
 * with a 30% chance of finding an item and a 70% chance of not finding one.
 * This algorithm is based on a random number generation and conditional logic.
 *
 * @return boolean indicating whether the player found an item (true) or not (false)
 */
    public boolean searchForItem() {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int < 30) {
        // Player finds an item
            return true;
        }else {
        // Player does not find an item
            return false;
        }
    }    
}
