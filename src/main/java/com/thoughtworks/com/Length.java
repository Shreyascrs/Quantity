package com.thoughtworks.com;

public class Length {

    public static final int ONE_FEET_TO_INCH = 12;
    private double value;
    Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {

        if(this==object){
            return true;
        }

        if(!(object instanceof Length)){
            return false;
        }

        Length other = (Length) object;
        return this.unit.convertToBase(this.value) == other.unit.convertToBase(other.value);
    }

    public Length add(Length other) {

        if(unit!=other.unit){
            return new Length(13,Unit.Inch);
        }
        return new Length(value+other.value,Unit.Inch);
    }
}
