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
     * Getter for world time
     * @return the time
     */
    public int getTime(){
        return time;
    }

    /**
     * Getter for world weather
     * @return the weather
     */
    public String getWeather(){
        return weather;
    }

    /**
     * Getter for world temperature
     * @return the temperature
     */
    public int getWorldTemp(){
        return worldTemp;
    }

    /**
     * Determines the room based on its name
     */
    public void checkRoom(Room room){
        
    }

    /**
     * This method provides a list of commands to the user when asked
     */
    public String help() {
        var sb = new StringBuilder();
        sb.append("List of commands:\n");
        sb.append("help: display this message\n");
        sb.append("to: go to an area\n");
        sb.append("eat, consume, drink: consume an item\n");
        sb.append("inventory: check your inventory\n");
        sb.append("stats: check your stats");
        return sb.toString();
    }
}
