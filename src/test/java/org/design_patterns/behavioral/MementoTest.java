package org.design_patterns.behavioral;

import org.design_patterns.behavioral.memento.CareTaker;
import org.design_patterns.behavioral.memento.Originator;
import org.junit.Test;

public class MementoTest {
    @Test
    public void test() {
        Originator originator = new Originator("Initial state");
        CareTaker careTaker = new CareTaker();

        careTaker.saveState(originator.createMemento());

        System.out.println("Current state is: " + originator.state);

        originator.state = "State 1";

        careTaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        originator.state = "State 2";
        careTaker.saveState(originator.createMemento());
        System.out.println("Current state is: " + originator.state);

        System.out.println("------------------------");

        originator.restoreMemento(careTaker.restoreState(1));
        System.out.println("Current state is: " + originator.state);

        originator.restoreMemento(careTaker.restoreState(0));
        System.out.println("Current state is: " + originator.state);

        originator.restoreMemento(careTaker.restoreState(2));
        System.out.println("Current state is: " + originator.state);
    }
}
