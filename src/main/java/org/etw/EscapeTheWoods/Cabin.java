package org.etw.EscapeTheWoods;
import java.util.Random;
import java.util.Scanner;

public class Cabin extends Room {
    // Attributes
    private Enemy enemy;
    Scanner in = new Scanner(System.in);

    //Constructor
    public Cabin(Enemy enemy){
        super(1, "You see a cabin in the distance", "Abandoned Cabin");
        this.enemy = enemy;
    }

    //public boolean exploreCabinPlayer(Scanner choice)

    /**
     * The player has a 30% chance of encountering
     * an enemy. Method is used every time the player does
     * an action, besides battling. 
     * @return true if player encounters an enemy, false if not
     */
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
     * either the enemy dies, the player dies, or the player
     * flees.
     */
    public void play(Player player, World world) {
        System.out.println("You see a cabin in the distance.");
        Random rand = new Random();
        boolean fleeSuccess = false;
        if (enemyEncounter()) {
            System.out.println("You have encountered an enemy!");
            while(player.getHealth() > 0 || enemy.getHealth() > 0 || !fleeSuccess) {
                System.out.println("What will you do?");
                System.out.println("Attack       Flee");
                String choice = in.nextLine();
                if (choice.equalsIgnoreCase("Attack")) {
                    System.out.println("The enemy takes " + player.getDamage() +" damage!");
                    enemy.takeDamage(player.getDamage());
                    System.out.println("The enemy attacks!");
                    System.out.println("You take " + enemy.getDamage() + " damage!");
                    player.takeDamage(enemy.getDamage());
                } else if (choice.equalsIgnoreCase("Flee")) {
                    System.out.println("You try to escape!");
                    int rand_int = rand.nextInt(100);
                    if (rand_int >= 10) {
                        System.out.println("Failure!");
                        fleeSuccess = false;
                        System.out.println("The enemy attacks!");
                        System.out.println("You take " + enemy.getDamage() + " damage!");
                        player.takeDamage(enemy.getDamage());
                    } else {
                        System.out.println("Success!");
                        fleeSuccess = true;
                    }
                } else {
                    System.out.println("Please enter a valid input.");
                    break;
                }
            }
        }
        if (player.isDead()) {
            player.die();
        }
        System.out.println("You have escaped the cabin!");
        player.position = new Lake();
        player.position.play(player, world);
    }
}
