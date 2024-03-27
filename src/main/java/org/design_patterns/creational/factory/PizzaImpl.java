package org.design_patterns.creational.factory;

import org.design_patterns.creational.factory.interfaces.Shape;

public class PizzaImpl implements Shape {
    @Override
    public String getShape() {
        return "Round";
    }
}
