package org.etw.EscapeTheWoods;
import java.util.Random;
import java.util.Scanner;

public class Cabin extends Room {

    // Attributes
    private Player player;
    private Enemy enemy;

    //Constructor
    public Cabin (double difficulty,String description, String roomName, Player player, Enemy enemy){
        super(1, "You see a cabin in the distance", "Abandoned Cabin");
        this.player = player;
        this.enemy = enemy;
    }

    //public boolean exploreCabinPlayer(Scanner choice)

    public boolean enemyEncounter(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 70){
            //Player does not encounter an enemy
            return false;
        } else {
            //Player does encounter an enemy
            return true;
        }
    }

   /**
     * Player looks around the lake for potential items.
     * There is a 20% chance of finding an item.
     * @return false if they don't find an item, true if they do
     */
    public boolean itemFind() {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 20) {
            // Player does not find item
            return false;
        } else {
            // Player finds item
            return true;
        }
    }

    /**
     * Battle system. The player will enage in combat with a
     * random enemy. Player can either attempt to retreat, or
     * fight back against the attack. The fight ends when
     * either the enemy dies, or the player dies.
     */
    public void battle(Player player, Enemy enemy, Scanner in) {
        if (enemyEncounter()) {
            System.out.println("You have encountered an enemy!");
            while(player.getHealth() != 0 || enemy.getHealth() != 0) {
                System.out.println("What will you do?");
                System.out.println("Attack       Flee");

            }
        }
    }
}
