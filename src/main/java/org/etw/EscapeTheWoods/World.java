// Your VSCode is definitely set up incorrectly, we'll have to fix
// it later. It should be `org.etw.EscapeTheWoods`.
package org.etw.EscapeTheWoods;

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
    }
}
