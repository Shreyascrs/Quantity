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
        if (this.value == 0 && ((Length) object).value == 0) {
            return true;
        }

        return this.value == ((Length) object).value && this.unit == ((Length) object).unit;


    }
}
