// Your VSCode is definitely set up incorrectly, we'll have to fix
// it later. It should be `org.etw.EscapeTheWoods`.
package org.etw.EscapeTheWoods;

public class World {
    private int time;
    private String weather;
    private int worldTemp;

    public World(int time, String weather, int worldTemp){
        this.time = time;
        this.weather = weather;
        this.worldTemp = worldTemp;
    }


    public void checkRoom(){
        //to do
    }

    /**
     * This method provides a list of commands to the user when asked
     */
    public void help() {
        System.out.println("List of commands: ");
    }
}
