package org.design_patterns.behavioral;

import org.design_patterns.behavioral.command.CommandProcessor;
import org.design_patterns.behavioral.command.OrderAddCommand;
import org.design_patterns.behavioral.command.OrderExecuteCommand;
import org.junit.Test;

public class CommandTest {

    @Test
    public void test() {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1, 19.99))
                .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(2))
                .processCommands();
    }
}
