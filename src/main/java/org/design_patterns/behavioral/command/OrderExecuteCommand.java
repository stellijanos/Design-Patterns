package org.design_patterns.behavioral.command;

import org.design_patterns.behavioral.command.interfaces.Command;

public class OrderExecuteCommand implements Command {

    int id;
    public OrderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Order " + id + " executed.");
    }
}
