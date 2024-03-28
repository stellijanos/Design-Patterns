package org.design_patterns.behavioral.observer;

import org.design_patterns.behavioral.observer.interfaces.EventListener;

public class LogOpenListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("LogOpenListener: " + eventType + " performed on file " + file);
    }
}
