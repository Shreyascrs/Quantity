package com.thoughtworks.com;

public class Quantity {

    public static final int ONE_FEET_TO_INCH = 12;
    private double value;
    Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if(this==object){
            return true;
        }

        if(!(object instanceof Quantity)){
            return false;
        }

        Quantity other = (Quantity) object;
        return this.unit.convertToBase(this.value) == other.unit.convertToBase(other.value);
    }

    public Quantity add(Quantity other) {
        return new Quantity(unit.convertToBase(value)+other.unit.convertToBase(other.value),Unit.Inch);
    }
}
