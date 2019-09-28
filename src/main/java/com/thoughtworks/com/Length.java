package com.thoughtworks.com;

public class Length {

    public static final int ONE_FEET_TO_INCH = 12;
    private int value;
    Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {

        Length other = (Length) object;
        return this.unit.convertToBase(this.value) == other.unit.convertToBase(other.value);
    }

}
