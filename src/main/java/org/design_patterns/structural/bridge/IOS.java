package org.design_patterns.structural.bridge;

import org.design_patterns.structural.bridge.interfaces.PhoneOS;

public class IOS implements PhoneOS {
    @Override
    public void upload(String data) {
        System.out.println("IPhone uploading data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("IPhone downloading from: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("IPhone displaying data: " + data);
    }
}
