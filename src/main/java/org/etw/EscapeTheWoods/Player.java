package org.etw.EscapeTheWoods;

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
    private boolean isSick;

    
    public Player() {
        super(100, 100, 1, 10);
        this.inventory = new ArrayList<>();
        this.temperature = 98.6;
        this.thirst = 0;
        this.hunger = 0;
        this.score = 0;
        this.isSick = false;
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
