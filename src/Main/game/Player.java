package Main.game;

import Main.characters.Fighter;

public abstract class Player {
    private String myName;
    private Fighter myFighter;

    protected Player(String myName, Fighter myFighter) {
        this.myName = myName;
        this.myFighter = myFighter;
    }

    protected int getFightersHP(boolean withText) {
        return myFighter.getHp(withText);
    }

    protected Fighter getFighter() {
        return myFighter;
    }

    protected void moveList(String choice, Fighter target){
        switch (choice){
            case "1": myFighter.attack(target); break;
            case "2": myFighter.heal(10); break;
            case "3": break;
            case "4": break;
            default: break;
        }
    }

    protected String getMyName() {
        return myName;
    }
}
