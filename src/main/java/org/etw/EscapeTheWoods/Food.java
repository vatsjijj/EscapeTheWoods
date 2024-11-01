package org.etw.EscapeTheWoods;

public class Food extends Item{

    private int quantity;


    public Food(String name, String description, int rarity, int quantity){
        super(name,description,rarity);
        this.quantity = quantity;
    }

}
