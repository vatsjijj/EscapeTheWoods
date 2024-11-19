package org.etw.EscapeTheWoods;
/**
 * Class: Player
 * @author Aidan
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: A class representing an Player in 
 * Escape the Woods. 
 */

import java.util.ArrayList;
import java.io.Serializable;

/**
 * The main class that represents the singular player of the game.
 * It is able to be serialized to the disk, so it is saveable.
 */
public class Player extends Entity implements Serializable {
    private ArrayList<Item> inventory;
    private double temperature;
    private double thirst;
    private double hunger;
    private int score;

    //Constructor
    public Player() {
        super(100, 100, 1, 10);
        this.inventory = new ArrayList<>();
        this.temperature = 98.6;
        this.thirst = 0;
        this.hunger = 0;
        this.score = 0;
    }

    /**
     * Allows the player entity to eat a food item.
     * @param food The food to be eaten.
     * @return True if the food was eaten, false otherwise.
     */
    public boolean eat(Food food) {
        // Need to expand on the Food class.
        return true;
    }

    /**
     * Allows the player entity to drink a "food" item.
     * @param drink The item to consume.
     * @return True if the "food" was drank, false otherwise.
     */
    public boolean drink(Food drink) {
        // Need to expand on the Food class.
        return true;
    }

    /**
     * Adds an item to the player inventory.
     * @param item The item to be added to the inventory.
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
    * Removes an item from the player's inventory.
    *
    *@param item the item to remove.
    *@return true if the item was removed, false if otherwise.
    */
    public boolean removeItem(Item item) {
        if (inventory.contains(item)) { 
            inventory.remove(item));
            System.out.println(item.getName() + " has been removed from your inventory.");
            return true;
        } else {
            System.out.println("the item is not in your inventory.");
            return false;
        }
    }

    /**
     * A getter for the temperature of the player.
     * @return The temperature of the player.
     */
    public double getTemperature() {
        return this.temperature;
    }

    /**
     * A getter for the hunger of the player.
     * @return The hunger of the player.
     */
    public double getHunger() {
        return this.hunger;
    }

    /**
     * A getter for the thirst of the player.
     * @return The thirst of the player.
     */
    public double getThirst() {
        return this.thirst;
    }

    /**
     * A getter for the inventory of the player.
     * @return The inventory of the player.
     */
    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    /**
     * A getter for the score of the player.
     * @return The score of the player.
     */
    public int getScore() {
        return this.score;
    }
}
