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
    public Lake() {
        super(1, "You have found a lake.", "Lake");
    }

    /**
     * Method that gives the player the choice to 
     * either fish or explore.
     * @param choice A scanner than takes the user's input
     */
    public void askPlayer(){
        Scanner choice = new Scanner(System.in);
        String userChoice = "";
        System.out.println("Would you like to fish or explore?");
        userChoice = choice.nextLine();
        if (userChoice.equalsIgnoreCase("fish")) {
            catchFish();
        } else if (userChoice.equalsIgnoreCase("explore")) {
            // To be Implemented 
            exploreLake();
        }
        choice.close();
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
    
    /**
     * Plays the level.
     * @param player The player character.
     * @param world The game world.
     * @see Player
     * @see World
     */
    public void play(Player player, World world){
        Scanner choice = new Scanner(System.in);
        String playerChoice = "";
        boolean leave = false;

        while (!leave) {
            System.out.println("What would you like to do?");
            System.out.println("1. Fish");
            System.out.println("2. Explore");
            System.out.println("3. Leave the lake");
            playerChoice = choice.nextLine();

            switch (playerChoice.toLowerCase()) {
                case "fish":
                boolean fishAgain = true;
                while (fishAgain){
                    if (catchFish()) {
                        System.out.println("You caught a fish!");
                        System.out.println("Would you like to try again? (yes/no)");
                    } else {
                        System.out.println("You didn't catch anything.");
                        System.out.println("Would you like to try again? (yes/no)");
                    }
                    String tryFishAgain = choice.nextLine();
                    if (!tryFishAgain.equalsIgnoreCase("yes")){
                        fishAgain = false;
                    }
                }
                break;
            case "explore":
                boolean exploreAgain = true;
                while (exploreAgain){
                    if (exploreLake()) {
                        System.out.println("You found an item!");
                        System.out.println("Would you like to keep searching? (yes/no)");
                    } else {
                        System.out.println("You didn't find anything.");
                        System.out.println("Would you like to keep searching? (yes/no)");
                    }
                    String tryAgain = choice.nextLine();
                    if (!tryAgain.equalsIgnoreCase("yes")){
                        exploreAgain = false;
                    }
                }
                break;
            case "leave":
                System.out.println("You decide to leave the lake.");
                leave = true;
                break;
            default:
                System.out.println("Invalid Input.");
                break;
            }
        }
        choice.close();

        System.out.println("You have escaped the woods!");
        System.exit(0);
    }
}
