package Main.characters;

import java.util.Random;

public class Warrior extends Character {

    public Warrior() {
        super(100, 5, 15);
    }

    public void specialAbility(Character target) {

    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public int heal() {
        return 0;
    }
}
