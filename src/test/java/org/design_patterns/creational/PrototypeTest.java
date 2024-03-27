package org.design_patterns.creational;

import org.design_patterns.creational.prototype.Bicycle;
import org.design_patterns.creational.prototype.Car;
import org.design_patterns.creational.prototype.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void test() {
        Vehicle c1 = new Car(4, 30000,"red");
        Vehicle c2 = c1.clone();

        assertEquals(c2.isClone(c1), c1.isClone(c2));

        Vehicle b1 = new Bicycle(4, 30000,true);
        Vehicle b2 = b1.clone();

        b2.isClone(b1);
        b1.isClone(b2);

        assertEquals(b1.isClone(b2), b2.isClone(b1));

        assertFalse(b1.isClone(c1));
    }
}
