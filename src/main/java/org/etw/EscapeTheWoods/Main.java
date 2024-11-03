package org.etw.EscapeTheWoods;

import java.util.Scanner;

/**
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
        
        Scanner userChoice = new Scanner(System.in);
        String yesOrNo = userChoice.nextLine();
        switch(yesOrNo) {
            case "Y":

                break;
            case "N":

                break;
            default:
                
                break;
        }

        userChoice.close();
    }
}
