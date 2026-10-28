package Main.characters;

public class Mage extends Character {


    public Mage(int maxHp, int minDamage, int maxDamage) {
        super(100,5,15);
    }

    @Override
    public void specialAbility(Character target) {
        heal(5);
    }

}
