package Main.game;

import Main.characters.Archer;
import Main.characters.Warrior;

import java.util.Random;

public class Game {
    //Game starts from Main-class

    //Select Fighter

    //1st turn

    //The fastest player/character start
    //Other one goes last

    //2nd turn... (looping)

    //If one of the player has lost HP, the other one wins.
    //The loop/game ends.

    public void battle() {

        HumanPlayer me = new HumanPlayer("Fausto",new Warrior());
        ComputerPlayer it = new ComputerPlayer("Machine", new Archer());
        Boolean startText = true;
        Random rand = new Random();

        while(me.getFightersHP(startText) > 0 && it.getFightersHP(startText) > 0) {
            System.out.println();
            me.chooseMove(it.getFighter());
            it.chooseMove(me.getFighter());
            System.out.println();
            me.getFightersHP(true);
            it.getFightersHP(true);
            startText = false;
        }
        if(me.getFightersHP(false) < it.getFightersHP(false)) System.out.println(it.getMyName() + " vinner!");
        else System.out.println(me.getMyName() + " vinner!");
    }
}
