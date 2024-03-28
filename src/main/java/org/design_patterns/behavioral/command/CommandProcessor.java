package org.design_patterns.behavioral.command;

import org.design_patterns.behavioral.command.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {

    List<Command> commands = new ArrayList<>();

    public CommandProcessor addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void processCommands() {
        for (Command c: commands) {
            c.execute();
        }
    }

}
