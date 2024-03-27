package org.design_patterns.creational.factory;

import org.design_patterns.creational.factory.interfaces.Shape;

public class BurritoImpl implements Shape {
    @Override
    public String getShape() {
        return "Cylinder";
    }
}
