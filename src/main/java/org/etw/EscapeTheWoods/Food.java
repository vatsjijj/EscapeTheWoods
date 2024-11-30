package org.etw.EscapeTheWoods;
/**
 * Class: Food
 * @author Gerry Bennett
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: This class represents the Food class for the Escape the Woods project
 */
public class Food extends Item{

    //attribute
    private int quantity;

    //fish food item?

    /**
     * Food Constructor
     * @param name
     * @param description
     * @param rarity
     * @param quantity
     */
    public Food(String name, String description, int rarity, int quantity){
        super(name,description,rarity);
        this.quantity = quantity;
    }

    /**
     * A red berry item. Safe to eat and common.
     * @return the red berry
     */
    public static Food redBerry(){
        return new Food("Berry", "Safe to eat", 1, 1);
    }

    /**
     * A white berry item. Harmful to eat and common.
     * @return the white berry
     */
    public static Food whiteBerry(){
        return new Food("White Berry", "Not safe to eat", 1, 1);
    }

    /**
     * A blue berry item. Safe to eat, slightly more rare.
     * @return the blue berry
     */
    public static Food blueBerry(){
        return new Food("Blue Berry", "Safe to eat", 2, 1);
    }

    /**
     * A catfish item caught while fishing in the lake room.
     * @return the catfish
     */
    public static Item catFish(){
        return new Food("Cat Fish", "Common Fish", 1, 1);
    }

    /**
     * Get quantity method
     * 
     * @return quantity
     */
    public int getQuanity(){
        return this.quantity;
    }

}
