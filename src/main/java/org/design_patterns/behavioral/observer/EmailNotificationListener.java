package org.design_patterns.behavioral.observer;

import org.design_patterns.behavioral.observer.interfaces.EventListener;

public class EmailNotificationListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("EmailNotificationListener: " + eventType + " performed on file " + file);
    }
}
