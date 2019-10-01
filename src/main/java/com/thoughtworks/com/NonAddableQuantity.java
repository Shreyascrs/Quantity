package com.thoughtworks.com;

import com.thoughtworks.com.units.INonAddableUnit;

public class NonAddableQuantity {

    protected double value;
    private INonAddableUnit unit;


    protected NonAddableQuantity(double value, INonAddableUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }

        if (!(obj instanceof NonAddableQuantity)) {
            return false;
        }

        NonAddableQuantity other = (NonAddableQuantity) obj;
        NonAddableQuantity firstQuantity = this.unit.convertToBase(this.value);
        NonAddableQuantity secondQuality = other.unit.convertToBase(other.value);

        return firstQuantity.value == secondQuality.value && firstQuantity.unit.equals(secondQuality.unit);
    }

    @Override
    public String toString() {
        return "NonAddableQuantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
