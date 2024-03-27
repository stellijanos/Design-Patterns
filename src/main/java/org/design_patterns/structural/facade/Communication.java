package org.design_patterns.structural.facade;

public class Communication {
    public void send(String data) {
        System.out.println("Sending :" + data);
    }

    public void recieve(String response) {
        System.out.println("Receiving " + response);
    }
}
