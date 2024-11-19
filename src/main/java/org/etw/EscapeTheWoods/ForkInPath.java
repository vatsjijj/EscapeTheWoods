package org.etw.EscapeTheWoods;

import java.util.Random;
import java.util.Scanner;

/**
 * Class: ForkInPath
 * 
 * @author Payson Briggs
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: November 19, 2024
 * 
 * Purpose:
 * This class represents a room in which the player encounters a fork
 * in the path and must make decisions that affect their health, stamina,
 * and inventory.
 */
public class ForkInPath {

    // Attributes
    private Player player;

    /**
     * Constructor for the ForkInPath class.
     * 
     * @param player The player object interacting with the fork.
     */
    public ForkInPath(Player player) {
        this.player = player;
    }

    /**
     * Main logic for handling the player's encounter with the fork.
     * 
     * @param scanner A Scanner object for reading player input.
     */
    public void encounterFork(Scanner scanner) {
        System.out.println("You have entered a room with a fork in the path.");
        System.out.println("You see a path splitting into two directions: Left and Right.");
        System.out.println("Which direction would you like to go? (left/right)");

        String direction = scanner.nextLine().toLowerCase();

        if (direction.equals("left")) {
            // Player chooses left
            System.out.println("You chose to go left. You lose some stamina.");
            player.setStamina(player.getStamina() - 10);
            checkStamina();
        } else if (direction.equals("right")) {
            // Player chooses right
            System.out.println("You chose to go right.");
            handleRightPath();
        } else {
            System.out.println("Invalid choice. Please try again.");
            encounterFork(scanner); // Retry
        }
    }

    /**
     * Handles the events when the player chooses the right path.
     */
    private void handleRightPath() {
        if (player.getHunger() > 50) { // Example threshold for hunger
            System.out.println("You are feeling hungry. A random event occurs...");
            boolean survived = randomEvent();
            if (survived) {
                System.out.println("You survived the random event!");
                playerPassed();
            } else {
                System.out.println("You didn't survive the random event.");
                player.setHealth(0); // Player dies
            }
        } else {
            System.out.println("You are not hungry. You find some food and add it to your inventory.");
            Item food = new Food("Berries", "A handful of berries.", 1, 5);
            player.addItem(food);
            playerPassed();
        }
    }

    /**
     * Simulates a random event with a chance of survival.
     * 
     * @return true if the player survives, false otherwise.
     */
    private boolean randomEvent() {
        Random rand = new Random();
        int chance = rand.nextInt(100); // Generate a random number between 0-99
        return chance >= 20; // 80% chance of survival
    }

    /**
     * Checks the player's stamina and notifies them if it runs out.
     */
    private void checkStamina() {
        if (player.getStamina() <= 0) {
            System.out.println("You have run out of stamina and collapse. Be careful next time!");
            player.setHealth(0); // Player dies
        } else {
            playerPassed();
        }
    }

    /**
     * Notifies the player that they have successfully passed the fork.
     */
    private void playerPassed() {
        System.out.println("You have successfully passed the fork in the path!");
    }
}


    
        
