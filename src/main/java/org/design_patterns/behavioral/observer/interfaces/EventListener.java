package org.design_patterns.behavioral.observer.interfaces;

public interface EventListener {
    void notify(String eventType, String file);
}
