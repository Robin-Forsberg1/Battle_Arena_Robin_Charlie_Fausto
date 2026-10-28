package Test;

import Main.characters.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    Warrior warrior;
    Archer archer;

    @BeforeEach
    void setUp() {
        warrior = new Warrior();
        archer = new Archer(100, 5, 15);
    }

    @Test
    void warriorAttacksArcher() {
        int damage = warrior.attack(archer);
        System.out.println("Archers HP är nu: "+archer.getHp()+"\n");
        assertTrue(damage >=5 && damage <= 15);
    }

    @Test
    void archerLoseHPToZero() {
        while (archer.getHp() > 1) {
            warrior.attack(archer);
            System.out.println("Archers HP är nu: "+archer.getHp()+"\n");
        }
        assertTrue(archer.getHp() == 0);
    }

    @Test
    void archerHealsThemselves() {

        warrior.attack(archer);
        System.out.println("Archers HP är nu: "+archer.getHp()+"\n");
        int afterDamageHP = archer.getHp();
        int heal = archer.heal(5);
        System.out.println("Archers HP är nu: "+archer.getHp()+"\n");

        assertTrue(archer.getHp() == afterDamageHP + heal);

    }
}