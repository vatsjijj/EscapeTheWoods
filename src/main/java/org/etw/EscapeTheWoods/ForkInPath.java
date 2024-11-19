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
        }
    }
}
        
