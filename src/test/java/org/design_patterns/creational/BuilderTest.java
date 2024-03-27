package org.design_patterns.creational;

import org.design_patterns.creational.builder.Apartment;
import org.design_patterns.creational.builder.ApartmentBuilder;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void test() {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder
                .setSqm(25)
                .setRooms(2)
                .setCity("London")
                .setArea("Kensington")
                .setHasKitchen(true)
                .build();

        Apartment ap2 = builder
                .setRooms(2)
                .setCity("Paris")
                .build();

        System.out.println(ap1);
        System.out.println(ap2);
    }
}
