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

    public int getTime(){
        return time;
    }

    public String getWeather(){
        return weather;
    }

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
        sb.append("Note: ONLY SOME OF THESE WORK!\n");
        sb.append("help: display this message\n");
        sb.append("inventory: check your inventory\n");
        sb.append("stats: check your stats");
        return sb.toString();
    }
}
