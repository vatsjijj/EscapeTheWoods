package org.etw.EscapeTheWoods;
import java.util.Random;

public class Cabin extends Room {

    //Constructor
    public Cabin (double difficulty,String description, String roomName){
        super(1, "You see a cabin in the distance", "Abandoned Cabin");
    }

    //public boolean exploreCabinPlayer(Scanner choice)

    public boolean enemyEncounter(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        if (rand_int >= 70){
            //Player does not encounter an enemy
            return false;
        } else {
            //Player does encounter an enemy
            return true;
        }
    }

    //public boolean itemFind()

    




}
