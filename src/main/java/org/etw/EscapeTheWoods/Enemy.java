
package org.etw.EscapeTheWoods;

import java.util.Random;

/**
 * Class: Enemy 
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: This class represents an enemy the player has 
 * a chance of fighting. To be used in the Bear room and
 * the abandoned cabin room.
 */
public class Enemy extends Entity {

    /**
     * Constructor 
     * @param health
     * @param stamina
     * @param damage
     * @param speed
     */
    public Enemy(double health, double stamina, int damage, int speed) {
        super(health, stamina, damage, speed);
    }

    /**
     * If the enemy's health is below or equal to half, 
     * they have a 20% chance of retreating, ending the battle.
     * 
     * @return true if retreat was sucessful, false if not
     */
    public boolean retreat() {
        double health = getHealth();
        if (health <= health / 2) {
            Random rand = new Random();
            int rand_int = rand.nextInt(100);
            if (rand_int > 80) {
                return true;
            }
        }
        return false;
    }

    /**
     * The enemy has a 10% chance of doing a special attack.
     * For now, it's just a more damaging attack.
     * 
     * @return True if the special attack goes through, false if not
     */
    public boolean specialAttack(Entity entity) {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 90) {
            return entity.takeDamage(50);
        }
        return false;
    }
}
