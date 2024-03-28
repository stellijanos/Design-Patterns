package org.design_patterns.structural.decorator;

import org.design_patterns.structural.decorator.interfaces.CoffeMachine;

public class EnhancedCoffeMachine implements CoffeMachine {

    private NormalCaffeMachine machine;

    public EnhancedCoffeMachine(NormalCaffeMachine machine) {
        this.machine = machine;
    }

    // override behaviour
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffe machine: making small cofee");
    }

    // unaltered behaviour
    @Override
    public void makeLargeCoffe() {
        machine.makeLargeCoffe();
    }

    // extended behaviour

    public void makeMilkCoffe() {
        System.out.println("Enhanced coffee machine: Making milk coffee");
        machine.makeLargeCoffe();
        System.out.println("Enhanced coffe machine: adding milk");
    }

}
