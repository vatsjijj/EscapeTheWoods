package org.etw.EscapeTheWoods;

/**
 * Class: Entity 
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: A class representing an Entity in 
 * Escape the Woods. An entity could be
 * a player, or an enemy.
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
    *getter for stamina.
    *@return the entity's current stamina.
    */

    /**
    * Setter for stamina.
    *
    * @param stamina the value to set as the entity's stamina
    */
    public void setStamina(double stamina) { 
        if (stamina < 0) {
            this.stamina = 0;
        } else if (stamina > 100) {
            this.stamina = 100;
        } else {
            this.stamina = stamina;
        }
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

    public int getDamage(){
        return this.damage;
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
     * Getter for speed
     * @return
     */
    public int getSpeed() {
        return this.speed;
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
