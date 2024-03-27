package org.design_patterns.structural;

import org.design_patterns.structural.facade.NetworkAccessFacade;
import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        NetworkAccessFacade access = new NetworkAccessFacade();
        access.communicate();
    }
}
