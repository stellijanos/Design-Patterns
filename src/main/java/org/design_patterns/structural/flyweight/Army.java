package org.design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank rank) {
        Fighter f = FighterFactory.getFighter(rank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter f : army) {
            switch (f.getRank()) {
                case PRIVATE -> System.out.print("P ");
                case SERGEANT -> System.out.print("S ");
                default -> System.out.print("M ");
            }
        }
    }
}
