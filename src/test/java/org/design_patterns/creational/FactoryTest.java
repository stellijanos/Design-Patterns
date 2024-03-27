package org.design_patterns.creational;

import org.design_patterns.creational.factory.FoodFactory;
import org.design_patterns.creational.factory.Shape;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void foodFactory() {

        FoodFactory factory = new FoodFactory();

        Shape roundFood = factory.getFood("Round");
        Shape cylinderFood = factory.getFood("Cylinder");

        assertEquals("Round", roundFood.getShape());
        assertEquals("Cylinder", cylinderFood.getShape());
    }
}
