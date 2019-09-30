package com.thoughtworks.com;

public class QuantityFactory {

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
}
