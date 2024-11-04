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


    /**
     * Allows the player to drink water and checks if it causes sickness.
     * Reduces thirst and applies sickness effects based on water quality.
     *
     * @param water The water object being consumed
     */
    public void drinkWater(Water water) {
        System.out.println("You drank " + water.getQuality() + " qaulity water.");
        this.thirst = Math.max(thirst - 20, 0);

        if (water.causesSickness()) {
            System.out.println("You feel sick after drinking the water.");
            this.isSick = true;
        // this.stamina -= 10; // example effect 
        } else {
            System.out.println("you feel refreshed");
            this.isSick = false;
        }
    }

    /** 
     * @return true if player is sick, false if not,
     */
    public boolean isSick() {
        return this.isSick;
    }

    /**
     * Heals the player from sickness if they are currently sick.
     */
    public void healSickness() {
        if (isSick) {
            System.out.println("You have recovered from the sickness.");
            this.isSick = false;
        } else {
            System.out.println("You are already healthy.");
        }
    }
}


