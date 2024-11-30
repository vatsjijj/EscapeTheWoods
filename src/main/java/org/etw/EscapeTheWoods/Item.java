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
     * Wood item collected for use in fire. Common.
     * @return the wood
     */
    public static Item wood(){
        return new Item("Wood", "Scavenged Wood", 1);
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
