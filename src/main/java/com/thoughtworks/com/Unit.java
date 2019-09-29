package com.thoughtworks.com;

public enum Unit {


    Feet(12),

    Inch(1),

    Yard(36),

    Gallon(3.78),

    Liter(0);

    public double convertToBase(double value) {
        return value * conversionalValue ;
    }

    private double conversionalValue;

    Unit(double conversionalValue) {
        this.conversionalValue = conversionalValue;
    }

}


