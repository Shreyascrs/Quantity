package com.thoughtworks.com;

public enum Unit {


    Inch(1),

    Feet(12, Unit.Inch),

    Yard(36, Unit.Inch),

    Liter(1),

    Gallon(3.78, Unit.Liter);


    public Quantity convertToBase(Quantity quantity) {
        return new Quantity(quantity.value * conversionalValue, baseUnit);
    }

    private double conversionalValue;
    private Unit baseUnit;


    Unit(double conversionalValue) {
        this.conversionalValue = conversionalValue;
        this.baseUnit = this;
    }

    Unit(double conversionalValue, Unit baseunit) {
        this.conversionalValue = conversionalValue;
        this.baseUnit = baseunit;
    }

}


