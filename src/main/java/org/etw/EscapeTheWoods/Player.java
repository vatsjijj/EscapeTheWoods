package org.etw.EscapeTheWoods;

import java.util.ArrayList;

public class Player extends Entity {
    private ArrayList<Item> inventory;
    private double temperature;
    private double thirst;
    private double hunger;
    private int score;

    public Player() {
        super(100, 100, 1, 20);
        this.inventory = new ArrayList<>();
        this.temperature = 98.6;
        this.thirst = 0;
        this.hunger = 0;
        this.score = 0;
    }

    public boolean eat(Food food) {
        // Need to expand on the Food class.
        return true;
    }

    public boolean drink(Food drink) {
        // Need to expand on the Food class.
        return true;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHunger() {
        return this.hunger;
    }

    public double getThirst() {
        return this.thirst;
    }

    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public int getScore() {
        return this.score;
    }
}
