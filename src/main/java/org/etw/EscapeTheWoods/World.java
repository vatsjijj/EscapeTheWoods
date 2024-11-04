package org.etw.EscapeTheWoods;

/**
 * Class: World
 * @author Brandon Belfiore
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: A class representing the world of the game.
 * It features the time, weather, and temperature
 * of the world.
 */
public class World {
    private int time;
    private String weather;
    private int worldTemp;

    /**
     * Constructor
     * @param time
     * @param weather
     * @param worldTemp
     */
    public World(int time, String weather, int worldTemp){
        this.time = time;
        this.weather = weather;
        this.worldTemp = worldTemp;
    }

    /**
     * Determines the room based on its name
     */
    public void checkRoom(Room room){
        
    }

    /**
     * This method provides a list of commands to the user when asked
     */
    public void help() {
        System.out.println("List of commands: ");
        System.out.println("Note: NONE OF THESE WORK YET!");
        System.out.println("inventory: check your inventory");
        System.out.println("stats: check your stats");
    }
}
