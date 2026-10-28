package Main.game;
import Main.characters.Fighter;
import java.util.Random;

public class ComputerPlayer extends Player implements Control {
    public ComputerPlayer(String myName, Fighter myFighter) {
        super(myName, myFighter);
    }

    @Override
    public void chooseMove(Fighter target) {
        Random rand = new Random();
        moveList(String.valueOf(rand.nextInt(1,3)), target);
    }
}
