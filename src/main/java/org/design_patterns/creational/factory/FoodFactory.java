package org.design_patterns.creational.factory;

import org.design_patterns.creational.factory.interfaces.Shape;

public class FoodFactory {

    public Shape getFood(String type) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case "Round" -> new PizzaImpl();
            case "Cylinder" -> new BurritoImpl();
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}
