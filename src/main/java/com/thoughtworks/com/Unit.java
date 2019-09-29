package com.thoughtworks.com;

public enum Unit {


    Feet(12),

    Inch(1),

    Yard(36);

    public double convertToBase(double value) {
        return value * conversionalValue ;
    }

    private int conversionalValue;

    Unit(int conversionalValue) {
        this.conversionalValue = conversionalValue;
    }

}


