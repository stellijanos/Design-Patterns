package org.design_patterns.structural;

import org.design_patterns.structural.proxy.ProxyImage;
import org.design_patterns.structural.proxy.interfaces.Image;
import org.junit.Test;

public class ProxyTest {

    @Test

    public void test() {
        Image image = new ProxyImage("test.png");

        image.display();
        System.out.println();
        image.display();
    }
}
