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

    public static Item redBerry(){
        return new Item("Berry", "Safe to eat", 1 );
    }

    public static Item whiteBerry(){
        return new Item("White Berry", "Not safe to eat", 1);
    }

    public static Item blueBerry(){
        return new Item("Blue Berry", "Safe to eat", 2);
    }

    public static Item wood(){
        return new Item("Wood", "Scavenged Wood", 1);
    }

    public static Item catFish(){
        return new Item("Cat Fish", "Common Fish", 1);
    }

    public static Item ammo(){
        return new Item(".308 round", "Ammo used for rifle", 3);
    }

    public static Item stones(){
        return new Item("stone", "Ammo used for slingshot", 1);
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int rarity(){
        return this.rarity;
    }

} //end of class
