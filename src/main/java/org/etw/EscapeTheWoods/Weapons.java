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

    public int getDamageMultiplyer(){
        return DamageMultiplyer;
    }
}
