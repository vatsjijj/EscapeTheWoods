/**
 * Class: Room
 * @author Sydney McGreal
 * @version 1.0
 * Course: CSE 201 Spring 2024
 * Written: October 31, 2024
 * 
 * Purpose: This class represents the Room application for the Escape the Woods project
 */

package org.etw.EscapeTheWoods;

public class Room {
    // attributes
    private double difficulty;
    private String description;
    private String roomName;

    /**
     * Room Constructor
     * @param difficulty
     * @param description
     */
    public Room(double difficulty,String description, String roomName){
        this.difficulty = difficulty;
        this.description= description;
        this.roomName = roomName;
    }

    /**
     * Getter for the difficulty of the room
     * @return the difficulty
     */
    public double getDifficulty() {
        return this.difficulty;
    }

    /**
     * Getter for the description of the room
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for the name of the room
     * @return the room name
     */
    public String getRoomName() {
        return this.roomName;
    }

} // end of class
