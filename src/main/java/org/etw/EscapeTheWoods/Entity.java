package org.etw.EscapeTheWoods;

public class Entity {
    private double health;
    private double stamina;
    private int damage;
    private int speed;
    private Room position;

    public Entity(double health, double stamina, int damage, int speed) {
        this.health = health;
        this.stamina = stamina;
        this.damage = damage;
        this.speed = speed;
    }

    public Entity(
        double health,
        double stamina,
        int damage,
        int speed,
        Room position
    ) {
        this.health = health;
        this.stamina = stamina;
        this.damage = damage;
        this.speed = speed;
        this.position = position;
    }

    public void setPosition(Room position) {
        this.position = position;
    }
}
