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

    public void exploreLake() {
        
    }
}
