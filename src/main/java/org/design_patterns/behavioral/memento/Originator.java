package org.design_patterns.behavioral.memento;

public class Originator {
    public String state;

    public Originator(String state) {
        this.state = state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        state = memento.state;
    }
}
