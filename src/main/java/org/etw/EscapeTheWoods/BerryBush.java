/**
 * Class: BerryBush
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Fall 2024
 * Written: November 12, 2024
 * 
 * Purpose: A room of the scenerio where the player finds a berry bush,
 * and can choose to eat from it or not.
 */

package org.etw.EscapeTheWoods;

import java.util.Random;
import java.util.Scanner;

public class BerryBush extends Room {
    // Constructor
    public BerryBush() {
        super(1, "You have found a berry bush.", "Berry Bush");
    }

    /**
     * Method that determines the color of berries
     * which effects if the berries are safe to eat or not,
     * isEdible() method
     * 
     * 
     * @return color;
     */
    public String determineColor() {
        String color = "";
        Random rand = new Random();
        int option = rand.nextInt(3);
        switch(option) {
            case 1:
                // safe gives more than blue though
                color = "red";
                break;
            case 2:
                // safe
                color = "blue";
                break;
            case 3:
                // isn't safe
                color = "white";
                break;
            default:
                break;
        }

        return color;
    }

    /**
     * Method that returns if the berries are edible or not
     * 
     * @return boolean isEdible()
     */
    public boolean isEdible(){
        if (determineColor().equalsIgnoreCase("red") || determineColor().equalsIgnoreCase("blue") ) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Plays the level.
     * @param player The player character.
     * @param world The game world.
     * @see Player
     * @see World
     */
    public void play(Player player, World world) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("\nDo you want to pick the berries and eat them? Y/n");
        System.out.print("> ");
        var answer = userIn.nextLine() + '\n';
        var tk = new Tokenizer(answer);
        var toks = tk.tokenize();
        var result = Evaluate.eval(toks, player);
        var yes = switch (result) {
            case ProgramResult.Yes x -> true;
            default -> false;
        };
        // Needs stuff.
        if (yes && isEdible()) {
            System.out.println("You have eaten the berry! You feel a bit better!");
            player.health += 5;
        } else if (yes && !isEdible()) {
            System.out.println("You have eaten the berry! You feel really sick.");
            player.health -= 15;
        } else if (!yes && isEdible()) {
            System.out.println("You ignore the berries. Oh well...");
        } else {
            System.out.println("You gladly ignore the berries.");
        }

        System.out.println("What will you do next? Go north and continue your journey?");
        Main.eval(userIn, player, world);

        userIn.close();
    }

    //room description
    public void printRoomDescription(){
        System.out.println(getRoomName());
        System.out.println(getDescription());
    }
}
