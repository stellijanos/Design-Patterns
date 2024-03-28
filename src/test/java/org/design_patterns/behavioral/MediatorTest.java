package org.design_patterns.behavioral;

import org.design_patterns.behavioral.mediator.ChatUser;
import org.design_patterns.behavioral.mediator.Mediator;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void test() {
        Mediator mediator = new Mediator();
        ChatUser janos = new ChatUser("Janos", mediator);
        ChatUser stefan = new ChatUser("Stefan", mediator);
        ChatUser dominik = new ChatUser("Dominik", mediator);

        mediator.addUser(janos).addUser(stefan).addUser(dominik);

        janos.sendMessage("Hello everyone");
    }
}
