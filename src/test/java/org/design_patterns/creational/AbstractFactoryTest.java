package org.design_patterns.creational;

import org.design_patterns.creational.abstractFactory.Client;
import org.design_patterns.creational.abstractFactory.DatabaseFactoryImpl;
import org.design_patterns.creational.abstractFactory.NetworkFactoryImpl;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void factoryTest() {
        Client client1 = new Client(new DatabaseFactoryImpl());
        client1.communicate();

        Client client2 = new Client(new NetworkFactoryImpl());
        client2.communicate();
    }

}
