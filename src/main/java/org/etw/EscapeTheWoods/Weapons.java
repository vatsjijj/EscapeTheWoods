/**
 * Class: Weapons
 * @author Gerry Bennett
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: This class represents the Weapons application for the Escape the Woods project
 */

package org.etw.EscapeTheWoods;
//Inherits Item class
public class Weapons extends Item{
    // attributes
    private int DamageMultiplyer;

    /**
     * Weapons Constructor
     * @param name
     * @param description
     * @param rarity
     * @param DamageMultiplyer
     */
    public Weapons(String name, String description, int rarity, int DamageMultiplyer){ 
        super(name, description, rarity);
        this.DamageMultiplyer = DamageMultiplyer;
    }

    public static Weapons rifle(){
        return new Weapons("Rifle (.308)", "Old Rifle", 5, 100);
    }

    public static Weapons huntingKnife(){
        return new Weapons("Knife", "Hunting Knife", 2, 15);
    }

    public static Weapons axe(){
        return new Weapons("Axe", "Lumberjack's Axe", 3, 25);
    }

    public static Weapons slingShot(){
        return new Weapons("Slingshot", "Slingshot that launches stones", 2, 10);
    }

    public int getDamage(){
        return this.DamageMultiplyer;
    }
}
