package org.design_patterns.structural.flyweight;

import org.design_patterns.structural.flyweight.interfaces.Sprite;

public class Fighter implements Sprite {

    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    public FighterRank getRank() {
        return rank;
    }

    @Override
    public void draw() {
        System.out.println("drwaing fighter");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving fighter to position (" + x + ", " + y +" ");
    }
}
