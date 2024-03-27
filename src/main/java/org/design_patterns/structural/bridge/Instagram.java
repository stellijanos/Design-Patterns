package org.design_patterns.structural.bridge;

import org.design_patterns.structural.bridge.interfaces.App;
import org.design_patterns.structural.bridge.interfaces.PhoneOS;

public class Instagram implements App {

    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void run() {
        System.out.println();
        os.display("cached data");
        os.upload("instagram.com");
        os.download("instagram data");
        os.display("fresh data");
        System.out.println();
    }
}

