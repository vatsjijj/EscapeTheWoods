package org.etw.EscapeTheWoods;

import java.util.Scanner;

/**
 * Class: Main 
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose:
 * The Main Method of the Escape The Woods game.
 * This is where the code will run.
 * Right now it just tests the classes and has 
 * a very basic UI.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Escape the Woods.");
        System.out.println("Type help for a list of commands.");
        System.out.println("Would you like to start the game? [Y]/[N]");
        
        // Create the world and player
        World world = new World(1000, "Sunny", 80);
        Player player = new Player();

        Scanner userChoice = new Scanner(System.in);
        String yesOrNo = userChoice.nextLine();
        switch(yesOrNo) {
            case "Y":

                break;
            case "N":

                break;
            case "help":
                world.help();
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        userChoice.close();
    }
}
