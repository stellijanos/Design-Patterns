package org.design_patterns.structural.decorator;

import org.design_patterns.structural.decorator.interfaces.CoffeMachine;

public class NormalCaffeMachine implements CoffeMachine {
    @Override
    public void makeSmallCoffee() {
        System.out.println("Normal coffee machine: Making small coffee");
    }

    @Override
    public void makeLargeCoffe() {
        System.out.println("Normal coffee machine: Making large coffee");
    }
}
