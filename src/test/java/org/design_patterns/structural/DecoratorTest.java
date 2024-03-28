package org.design_patterns.structural;

import org.design_patterns.structural.decorator.EnhancedCoffeMachine;
import org.design_patterns.structural.decorator.NormalCaffeMachine;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        NormalCaffeMachine normal = new NormalCaffeMachine();
        EnhancedCoffeMachine enhanced = new EnhancedCoffeMachine(normal);

        normal.makeSmallCoffee();
        normal.makeLargeCoffe();
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffe();
        enhanced.makeMilkCoffe();
    }
}
