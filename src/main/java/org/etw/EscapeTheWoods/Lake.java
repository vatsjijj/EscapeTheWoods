/**
 * Class: Lake
 * @author Gerry Bennett
 * @version 1.0
 * Course: CSE201
 * Written 12 Nov 2024
 * 
 * Purpose: A room where the player finds a lake, and can choose whether to explore the area, fish, or leave.
 */
package org.etw.EscapeTheWoods;

public class Lake extends Room {

    //Constructor
    public Lake (double difficulty,String description, String roomName) {
        super(1, "You have found a lake.", "Lake");
    }

    
}
