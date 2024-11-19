package org.etw.EscapeTheWoods;
import java.util.Random;
import java.util.Scanner;

public class ForkInPath {
    private Player player;

    // constructor
    public ForkInPath (Player player){
        private Player player;
    }

    public void ecounterFork(Scanner scanner) {
        System.out.println("you have entered a room with a fork in the path.");
        System.out.println("you see a path splitting into two directions: Left and Right.");
        System.out.println("which direction would you like to go? (left/right)");

        String direction = scanner.nextLine().toLowerCase();
        if (direction.equals("Left")) { 
            //chooses left
            System.out.println("you chose to go left. You lose some stamina.");
            player.setStamina(player.getStamina() - 10); 
            checkStamina();
        } else if (direction.equals("right")) { 
            // chooses right
            System.out.println("you chose to go right.");
            if (player.getHunger() > 50) { 
                System.out.println("you are feeling hungry. A random event occurs...") 
                boolean surivived = randomEvent();
                if (survived) {
                    System.out.println("you survived the random event!");
                    playerPassed();
                } else {
                    System.out.println("you didn't survive the random event.");
                    playerPasswed();
                } else {
                    System.out.println("you didn't survive the random event.");
                    player.setHealth(0); // death 
            }
        } else { 
            System.out.println("You are not hungry. You find some food and add it to your inventory.");
            Item food = new Food("Berries", " A handful of berries.", 1, 5);
            player.addItem(food);
            playerPassed();
    } else {
        System.out.println("Invalid choice. Try again.");
        ecounterFork(scanner);
    }


/**
*simulates a random event with a chance of survival.
* 
*@return true if player survives, false otherwise.
*/
private boolean randomEvent() { 
    Random rand = new Random();
    int chance = rand.nextInt(100); 
    return chance >= 20;
}
/**
*checks the player's stamina and notifies they are exhausted.
*/
        private void checkStamina() { 
            if (player.getStamina() <= 0) {
                System.out.println("You have run out of stamina and collapse.");
                player.setHealth(0);
            } else {
                playerPassed();
            }
        }
/** 
* marks the player as successfully passing the fork.
*/
        private void playerPassed() { 
            System.out.println("you have successfully passed the fork in the path!");
        }
    }
}


    
        
