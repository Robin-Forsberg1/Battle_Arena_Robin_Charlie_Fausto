package Main.characters;

public class Warrior extends Character {

    public Warrior() {
        super(100, 5, 15);
    }

    @Override
    public String getName() {
        return "Warrior";
    }

    @Override
    public Actions getSpecialAction() {
        return Actions.DEFEND;
    }

    @Override
    public String specialAbility(Character target) {
        defend();

        return "Warrior försvarar sig själv och halverar nästa skada";
    }


}
