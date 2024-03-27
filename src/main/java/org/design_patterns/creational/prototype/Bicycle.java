package org.design_patterns.creational.prototype;

public class Bicycle extends Vehicle {

    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.wheels = wheels;
        this.price = price;
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    private boolean haveEqualAttributes(Bicycle other) {
        return this.wheels == other.wheels &&
                this.price == other.price &&
                this.cityBike == other.cityBike;
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bicycle t) {
            if (this.haveEqualAttributes(t)) {
                System.out.println(this + " and " + t + " are clones.");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are NOT clones.");
        return false;
    }
}
