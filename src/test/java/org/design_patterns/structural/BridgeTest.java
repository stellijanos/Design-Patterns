package org.design_patterns.structural;

import org.design_patterns.structural.bridge.Android;
import org.design_patterns.structural.bridge.Facebook;
import org.design_patterns.structural.bridge.IOS;
import org.design_patterns.structural.bridge.Instagram;
import org.design_patterns.structural.bridge.interfaces.App;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void test() {
        App facebook = new Facebook(new IOS());
        App instagram = new Instagram(new Android());

        facebook.run();
        instagram.run();
    }
}
