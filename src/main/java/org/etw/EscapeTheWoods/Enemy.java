
package org.etw.EscapeTheWoods;

import java.util.Random;

public class Enemy extends Entity {

    public Enemy(double health, double stamina, int damage, int speed) {
        super(health, stamina, damage, speed);
    }

    // Enemy has a 20% chance to retreat at half health
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

    public void specialAttack() {
        
    }
}
