package org.etw.EscapeTheWoods;

// Hello 
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

    public boolean attack(Entity entity) {
        return entity.damage(damage);
    }

    public boolean damage(int amount) {
        // This needs to have a random chance but
        // for now we'll pretend that it always
        // works.
        this.health -= amount;
        return true;
    }

    public boolean die() {
        this.health = 0;
        return true;
    }

    public void setPosition(Room position) {
        this.position = position;
    }

    public Room getPosition() {
        return this.position;
    }

    public double getHealth() {
        return this.health;
    }

    public double getStamina() {
        return this.stamina;
    }

    public boolean isDead() {
        return this.health <= 0.0;
    }
}
