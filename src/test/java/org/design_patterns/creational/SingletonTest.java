package org.design_patterns.creational;

import org.design_patterns.creational.singleton.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void singletonEager() {
        SingletonEager instance1 = SingletonEager.getEagerInstance();
        SingletonEager instance2 = SingletonEager.getEagerInstance();

        assertSame(instance2, instance1);

    }

    @Test
    public void singletonStaticBlock() {

        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();

        assertSame(instance2, instance1);
    }


    @Test
    public void singletonLazy() {

        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        assertSame(instance2, instance1);

    }

    @Test
    public void singletonThreadSafe() {

        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        assertSame(instance2, instance1);

    }


    @Test
    public void singletonBillPugh() {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

        assertSame(instance2, instance1);
    }
}
