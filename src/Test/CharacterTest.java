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
        warrior.attack(archer);
        System.out.println("Archers HP är nu: "+archer.getHp()+"\n");
        assertTrue(archer.getHp() <= 95 && archer.getHp() >= 85);
    }

    @Test
    void archerLoseHPToZero() {
        while (archer.getHp() > 1) {
            warrior.attack(archer);
            System.out.println("Archers HP är nu: "+archer.getHp()+"\n");
        }
        assertTrue(archer.getHp() == 0);
    }
}