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

    /**
     * A Weapon rifle that you can find. Extremely powerful, but very rare. 
     * Take Ammo item to use. Can only be found in the Cabin Room.
     * @return the rifle
     */
    public static Weapons rifle(){
        return new Weapons("Rifle (.308)", "Old Rifle", 5, 100);
    }

    /**
     * A Weapon knife that you can find. Decent strength, somewhat common.
     * @return the hunting knife
     */
    public static Weapons huntingKnife(){
        return new Weapons("Knife", "Hunting Knife", 2, 15);
    }

    /**
     * A Weapon axe that you can find. Powerful strength, somewhat rare.
     * @return the axe
     */
    public static Weapons axe(){
        return new Weapons("Axe", "Lumberjack's Axe", 3, 25);
    }

    /**
     * A Weapon slingshot that you can find. Weak, but stronger than Player's base damage.
     * Somewhat common. Requires Stones item to use, similar to Ammo for tthe rifle. 
     * @return the axe
     */
    public static Weapons slingShot(){
        return new Weapons("Slingshot", "Slingshot that launches stones", 2, 10);
    }

    /**
     * Getter for the damage multiplier
     * @return the damage multiplier
     */
    public int getDamage(){
        return this.DamageMultiplyer;
    }
}
