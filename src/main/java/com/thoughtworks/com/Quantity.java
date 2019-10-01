package com.thoughtworks.com;

import com.thoughtworks.com.units.IAddableQuantity;
import lombok.Getter;

@Getter
public class Quantity {

    protected double value;
    private IAddableQuantity unit;

    protected Quantity(double value, IAddableQuantity unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Quantity)) {
            return false;
        }

        Quantity other = (Quantity) object;
        Quantity firstQuantity = this.unit.convertToBase(this.value);
        Quantity secondQuantity = other.unit.convertToBase(other.value);

            return firstQuantity.value == secondQuantity.value && firstQuantity.unit.equals(secondQuantity.unit);

    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public Quantity add(Quantity other) {
        Quantity firstQuantity = this.unit.convertToBase(this.value);
        Quantity secondQuantity = other.unit.convertToBase(other.value);
        if (firstQuantity.unit.equals(secondQuantity.unit)) {
            return new Quantity(firstQuantity.value + secondQuantity.value, firstQuantity.unit);
        }
        throw new IllegalArgumentException("Two Different Quantity can't be added");
    }
}
