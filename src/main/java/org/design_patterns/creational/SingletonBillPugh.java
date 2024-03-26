package org.design_patterns.creational;

public class SingletonBillPugh {

    private SingletonBillPugh(){

    }

    private static class InnerStaticClass {
        private static final SingletonBillPugh billPughInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return InnerStaticClass.billPughInstance;
    }
}

