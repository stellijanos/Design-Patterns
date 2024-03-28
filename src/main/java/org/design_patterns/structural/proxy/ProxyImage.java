package org.design_patterns.structural.proxy;

import org.design_patterns.structural.proxy.interfaces.Image;

public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Proxy image: displaying \"" + filename + "\".");
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();

        System.out.println("Proxy image: logging \"" + realImage + "\"");
    }
}
