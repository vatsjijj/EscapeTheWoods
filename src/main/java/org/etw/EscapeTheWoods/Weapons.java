package org.etw.EscapeTheWoods;
//Inherits Item class
public class Weapons extends Item{
private int DamageMultiplyer;

    public Weapons(String name, String description, int rarity, int DamageMultiplyer){ 
        super(name, description, rarity);
        this.DamageMultiplyer = DamageMultiplyer;
    }
}
