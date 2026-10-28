package Main.game;

import java.util.Random;

public class Game {
    //Game starts from Main-class

    //Select Character

    //1st turn

    //The fastest player/character start
    //Other one goes last

    //2nd turn... (looping)

    //If one of the player has lost HP, the other one wins.
    //The loop/game ends.

    public void battle() {
        int playerHP = 100, cpuHP = 100, damage;
        Random rand = new Random();
        while(playerHP > 0 && cpuHP > 0) {
            damage = rand.nextInt(5, 30);
            playerHP = Math.max(0, playerHP - Math.max(0, damage));
            System.out.println("Player tog "+ damage+ " skada");
            damage = rand.nextInt(5, 30);
            cpuHP = Math.max(0, cpuHP - Math.max(0, damage));
            System.out.println("CPU tog "+ damage+ " skada");
            System.out.println("Player HP: "+playerHP+" CPU HP: "+cpuHP+"\n");
        }
        if(playerHP < cpuHP) System.out.println("CPUn vinner!");
        else System.out.println("Spelaren vinner!");
    }
}
