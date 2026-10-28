package Test;

import Main.characters.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    Warrior warrior;
    Archer archer;

    @BeforeEach
    void setUp() {
        warrior = new Warrior();
        archer = new Archer();
    }

    @Test
    void warriorAttacksArcher() {
        int damage = warrior.attack(archer);
        System.out.println("Archers HP är nu: "+archer.getHp(true)+"\n");
        assertTrue(damage >=5 && damage <= 15);
    }

    @Test
    void archerLoseHPToZero() {
        while (archer.getHp(true) > 1) {
            warrior.attack(archer);
            archer.getHp(true);
            System.out.println();
        }
        assertTrue(archer.getHp(true) == 0);
    }

    @Test
    void archerHealsThemselves() {

        warrior.attack(archer);
        int afterDamageHP = archer.getHp(true);
        System.out.println();
        int heal = archer.heal(5);

        assertTrue(archer.getHp(true) == afterDamageHP + heal);

    }
}