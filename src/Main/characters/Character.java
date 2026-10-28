package Main.characters;

import java.util.Random;

public abstract class Character implements Moves {
    private final int maxHp;
    private int hp;
    private final int minDamage;
    private final int maxDamage;

    private final Random random = new Random();

    public Character(int maxHp, int minDamage, int maxDamage) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public void attack(Character target) {
        int damage = random.nextInt(minDamage, maxDamage + 1);
        target.takeDamage(damage);

        System.out.println(getClass().getSimpleName()
        + " gör " + damage + " skada ");
    }

    public void heal (int amount) {
        hp = Math.min(maxHp, hp + amount);
        System.out.println(getClass().getSimpleName() + " helar sig själv med "+ amount);
    }

    public void takeDamage(int damage) {
        hp = Math.max(0, hp - Math.max(0, damage));
    }

    public int getHp(){
        return hp;
    }
}
