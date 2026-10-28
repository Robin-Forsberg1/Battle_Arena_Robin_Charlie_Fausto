package Main.game;
import Main.characters.Fighter;
import java.util.Scanner;

public class HumanPlayer extends Player implements Control {


    public HumanPlayer(String myName, Fighter myFighter) {
        super(myName, myFighter);
    }

    @Override
    public void chooseMove(Fighter target) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1: Attack | 2: Heal | 3: ... \nVälj: ");
        moveList(scan.nextLine(), target);
    }
}
