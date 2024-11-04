package org.etw.EscapeTheWoods;

/**
 * A class representing an Entity in 
 * Escape the Woods. An entity could be
 * a player, or an enemy.
 * 
 */
public class Entity {
    private double health;
    private double stamina;
    private int damage;
    private int speed;
    private Room position;

    /**
     * Constructor 1
     * @param health
     * @param stamina
     * @param damage
     * @param speed
     */
    public Entity(double health, double stamina, int damage, int speed) {
        this.health = health;
        this.stamina = stamina;
        this.damage = damage;
        this.speed = speed;
    }

    /**
     * Constructor 2
     * @param health
     * @param stamina
     * @param damage
     * @param speed
     * @param position
     */
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

    /**
     * Allows the entity to attack another entity
     * @param entity
     * @return if the attack went through
     */
    public boolean attack(Entity entity) {
        return entity.takeDamage(damage);
    }

    /**
     * The entity takes damage, decreasing its health
     * @param amount
     * @return true, will always take damage when called
     */
    public boolean takeDamage(int amount) {
        // This needs to have a random chance but
        // for now we'll pretend that it always
        // works.
        this.health -= amount;
        return true;
    }

    /**
     * Sets an entities health to zero
     * @return true, will always set to zero
     */
    public boolean die() {
        this.health = 0;
        return true;
    }

    /**
     * Setter for position
     * @param position
     */
    public void setPosition(Room position) {
        this.position = position;
    }

    /**
     * Getter for position
     * @return the position
     */
    public Room getPosition() {
        return this.position;
    }

    /**
     * Setter for health
     * @param health
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Getter for health
     * @return the health 
     */
    public double getHealth() {
        return this.health;
    }

    /**
     * Getter for stamina 
     * @return the stamina
     */
    public double getStamina() {
        return this.stamina;
    }

    /**
     * Checks if an entity is dead
     * @return true if health is less 
     * than or equal to zero.
     */
    public boolean isDead() {
        return this.health <= 0.0;
    }
}
