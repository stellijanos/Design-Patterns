package org.design_patterns.structural.proxy;

import org.design_patterns.structural.proxy.interfaces.Image;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        System.out.println("Real image: loading file \"" + filename +"\".");
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Real image: displaying image \"" + filename + "\"." );
    }
}
