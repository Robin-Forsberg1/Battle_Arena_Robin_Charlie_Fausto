package Main.characters;

public class Archer extends Character  {


    public Archer(int maxHp, int minDamage, int maxDamage) {
        super(100, 5, 15);
    }

    @Override
    public String getName() {
        return "Archer";
    }

    @Override
    public Actions getSpecialAction() {
        return Actions.EXTRA_ATTACK;
    }

    @Override
    public String specialAbility(Character target) {
        int firstHit = attack(target);
        int secondHit = attack(target);

        return "Archer attackerar två gånger och gör " + firstHit + " och " + secondHit + "skada";
    }
}
