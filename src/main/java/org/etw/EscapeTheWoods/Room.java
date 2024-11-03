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

    /**
     * Room Constructor
     * @param difficulty
     * @param description
     */
    public Room(double difficulty,String description){
        this.difficulty = difficulty;
        this.description = description;
    }

} // end of class
