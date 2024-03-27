package org.design_patterns.structural.bridge;

import org.design_patterns.structural.bridge.interfaces.App;
import org.design_patterns.structural.bridge.interfaces.PhoneOS;

public class Facebook implements App {

    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void run() {
        System.out.println();
        os.upload("Facebook data upload");
        os.download("facebook.com");
        os.display("Facebook data");
        System.out.println();
    }
}

