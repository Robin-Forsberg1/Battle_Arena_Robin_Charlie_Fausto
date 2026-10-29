package Main.game;

import Main.characters.Fighter;

public interface Control {
    void selectMove(Fighter target);
    void pickFighter();
}
