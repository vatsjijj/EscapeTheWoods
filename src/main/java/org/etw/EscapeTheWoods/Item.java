/**
 * Class: Item
 * @author Gerry Bennett
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: This class represents the Item application for the Escape the Woods project
 */

package org.etw.EscapeTheWoods;

public class Item {

    // attributes
    private String name;
    private String description;
    private int rarity;

    /**
     * Item Constructor
     * @param name
     * @param description
     * @param rarity
     */
    public Item(String name, String description, int rarity){
        this.name = name;
        this.description = description;
        this.rarity = rarity;
    }

} //end of class
