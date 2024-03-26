package org.design_patterns.creational;

public class SingletonEager {

    private static SingletonEager eagerInstance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}
