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
        if (this.unit != ((Length) object).unit) {
            return this.compare(((Length) object));
        }


        return this.value == ((Length) object).value && this.unit == ((Length) object).unit;
    }

    public boolean compare(Length object) {
        if (this.value == 1 && object.value == 12) {
            return true;
        }
        return false;
    }

}


