package org.design_patterns.creational;

import org.design_patterns.creational.abstractFactory.Client;
import org.design_patterns.creational.abstractFactory.DatabaseFactory;
import org.design_patterns.creational.abstractFactory.NetworkFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test
    public void factoryTest() {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();
    }

}
