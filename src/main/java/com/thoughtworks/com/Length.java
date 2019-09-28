package com.thoughtworks.com;

public class Length {

    private int value;
    Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return this.value == ((Length) object).value && this.unit == ((Length) object).unit;
    }
}
