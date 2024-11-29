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

    /**
     * A red berry item. Safe to eat and common.
     * @return the red berry
     */
    public static Item redBerry(){
        return new Item("Berry", "Safe to eat", 1 );
    }

    /**
     * A white berry item. Harmful to eat and common.
     * @return the white berry
     */
    public static Item whiteBerry(){
        return new Item("White Berry", "Not safe to eat", 1);
    }

    /**
     * A blue berry item. Safe to eat, slightly more rare.
     * @return the blue berry
     */
    public static Item blueBerry(){
        return new Item("Blue Berry", "Safe to eat", 2);
    }

    /**
     * Wood item collected for use in fire. Common.
     * @return the wood
     */
    public static Item wood(){
        return new Item("Wood", "Scavenged Wood", 1);
    }

    /**
     * A catfish item caught while fishing in the lake room.
     * @return the catfish
     */
    public static Item catFish(){
        return new Item("Cat Fish", "Common Fish", 1);
    }

    /**
     * Ammo item that can be found. Used when using a rifle weapon.
     * @return
     */
    public static Item ammo(){
        return new Item(".308 round", "Ammo used for rifle", 3);
    }

    /**
     * Stones item that can be found. Similar to ammo but for slingshot weapon.
     * @return
     */
    public static Item stones(){
        return new Item("stone", "Ammo used for slingshot", 1);
    }

    /**
     * Getter method for item name
     * @return the name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter method for item description
     * @return the description
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Getter method for item rarity
     * @return the rarity
     */
    public int getRarity(){
        return this.rarity;
    }

} //end of class
