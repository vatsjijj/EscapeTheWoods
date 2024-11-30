package org.etw.EscapeTheWoods;

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
    private static void gameLoop() {
        // Create the world and player
        World world = new World(1000, "Sunny", 80);
        Player player = new Player();

        player.addItem(Food.blueBerry());
        player.addItem(Food.catFish());

        // Create scanner
        Scanner userChoice = new Scanner(System.in);
        // answer is the nextLine
        System.out.print("> ");
        var answer = userChoice.nextLine() + '\n';
        var tk = new Tokenizer(answer);
        var toks = tk.tokenize();
        var result = Evaluate.eval(toks, player);
        for (;;) {
            boolean ok = true;
            switch (result) {
                case ProgramResult.Inventory x:
                    player.printInventory();
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
            if (!ok) {
                break;
            }
            System.out.print("> ");
            answer = userChoice.nextLine() + '\n';
            tk = new Tokenizer(answer);
            toks = tk.tokenize();
            result = Evaluate.eval(toks, player);
        }

        //close scanner
        userChoice.close();
    }


    //make random?
    //berry bush, forkInPath, cabin, lake

    public static void main(String[] args) {
        System.out.println("Welcome to Escape the Woods.");
        System.out.println("Type help for a list of commands.");
        
        gameLoop();
    }

} //end of main
