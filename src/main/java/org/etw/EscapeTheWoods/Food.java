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

}
