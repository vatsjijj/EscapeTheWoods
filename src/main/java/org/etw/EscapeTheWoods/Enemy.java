
package org.etw.EscapeTheWoods;

public class Enemy extends Entity {
    
    public Enemy(double health, double stamina, int damage, int speed) {
        super(health, stamina, damage, speed);
    }

    public boolean retreat() {
        
        return false;
    }

    public void specialAttack() {
        
        
    }
}
