package com.thoughtworks.com;

import lombok.Getter;

@Getter
public class Quantity {

    public static final int ONE_FEET_TO_INCH = 12;
    protected double value;
    private Unit unit;

    public static Quantity createFeet(double value) {
        return new Quantity(value, Unit.Feet);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.Inch);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.Yard);
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.Gallon);
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, Unit.Liter);
    }


    protected Quantity(double value, Unit unit) {
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

        return this.unit.convertToBase(this).value == other.unit.convertToBase(other).value &&
                this.unit.convertToBase(this).unit == other.unit.convertToBase(other).unit;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public Quantity add(Quantity other) {
        Quantity quantity1 = this.unit.convertToBase(this);
        Quantity quantity2 = other.unit.convertToBase(other);
        if (quantity1.unit == quantity2.unit) {
            return new Quantity(quantity1.value + quantity2.value, other.unit);
        }
        throw new IllegalArgumentException("Two Different Quantity can't be added");
    }
}
