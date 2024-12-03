package org.etw.EscapeTheWoods;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class: Main 
 * @author Aidan O'Connor
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose:
 * The Main Method of the Escape The Woods game.
 * This is where the code will run.
 * Right now it just tests the classes and has 
 * a very basic UI.
 */
public class Main {
    private static void handleRoom(String area, Player player, World world) {
        if (player.position == null) {
            switch (area.strip()) {
                case "bush", "berry bush", "berry", "berries":
                    player.position = new BerryBush();
                    ((BerryBush)player.position).printRoomDescription();
                    break;
                default:
                    System.out.println(
                        "There isn't an area named "
                        + area + '!'
                    );
                    break;
            }
        } else if (player.position.getRoomName() == "Berry Bush") {
            switch (area.strip()) {
                case "fork", "north", "forward", "path", "up", "onward", "forth":
                    player.position = new ForkInPath();
                    break;
                default:
                    System.out.println(
                        "There isn't an area named "
                        + area + '!'
                    );
                    break;
            }
        }
    }

    protected static boolean eval(Scanner scanner, Player player, World world) {
        System.out.print("> ");
        String answer = "";
        try {
            answer = scanner.nextLine() + '\n';
        } catch (NoSuchElementException e) {}
        var tk = new Tokenizer(answer);
        var toks = tk.tokenize();
        var result = Evaluate.eval(toks, player);
        boolean ok = true;
        switch (result) {
            case ProgramResult.Inventory x:
                player.printInventory();
                break;
            case ProgramResult.Stats x:
                player.printStats();
                break;
            case ProgramResult.To x:
                handleRoom(x.room(), player, world);
                player.position.play(player, world);
                break;
            case ProgramResult.Eat       x:
                player.eat(x.index());
                System.out.println("Consumed an item!");
                break;
            case ProgramResult.Yes       x: break;
            case ProgramResult.No        x: break;
            case ProgramResult.Help      x:
                System.out.println(world.help()); break;
            case ProgramResult.Error     x:
                System.err.println(x.msg());
                ok = false;
                break;
        }
        return ok;
    }

    private static void gameLoop() {
        // Create the world and player
        World world = new World(1000, "Sunny", 80);
        Player player = new Player();

        player.addItem(Food.blueBerry());
        player.addItem(Food.catFish());

        // Create scanner
        Scanner userChoice = new Scanner(System.in);
        for (;;) {
            if (!eval(userChoice, player, world)) {
                break;
            }
        }

        //close scanner
        userChoice.close();
    }


    //make random?
    //berry bush, forkInPath, cabin, lake

    public static void main(String[] args) {
        System.out.println("Welcome to Escape the Woods.");
        System.out.println("Type help for a list of commands.\n");
        System.out.println("You were lost in the woods and see a berry bush nearby.");
        
        gameLoop();
    }

} //end of main
