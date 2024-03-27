package org.design_patterns.creational.prototype;

import java.util.Objects;

public class Car extends Vehicle {

    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);
        if (target!= null) {
            color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    private boolean haveEqualAttributes(Car other) {
        return Objects.equals(color, other.color) &&
                wheels == other.wheels &&
                price == other.price;
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Car t) {
            if (this.haveEqualAttributes(t)) {
                System.out.println(this + " and " + t + " are clones.");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are NOT clones.");
        return false;
    }
}
