package org.design_patterns.structural;

import org.design_patterns.structural.flyweight.Army;
import org.design_patterns.structural.flyweight.FighterRank;
import org.junit.Test;

import java.util.Random;

public class FlyweightTest {

    @Test
    public void test() {
        int toDraw = 1000;

        Army army = new Army();

        FighterRank currentRank;

        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            switch(random.nextInt(3)) {
                case 0 -> currentRank = FighterRank.PRIVATE;
                case 1 -> currentRank = FighterRank.SERGEANT;
                default -> currentRank = FighterRank.MAJOR;
            }
            army.spawnFighter(currentRank);
        }

        army.drawArmy();
    }
}
