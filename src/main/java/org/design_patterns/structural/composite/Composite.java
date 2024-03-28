package org.design_patterns.structural.composite;

import java.util.ArrayList;

public class Composite extends Equipment{

    private final ArrayList<Equipment> equipments = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite add(Equipment equipment) {
        equipments.add(equipment);
        return this;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for(Equipment eq : equipments) {
            sum+= eq.getPrice();
        }
        return sum;
    }
}
