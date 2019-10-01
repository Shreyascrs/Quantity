package com.thoughtworks.com;

import com.thoughtworks.com.Units.*;

public class QuantityFactory {

    public static Quantity createFeet(double value) {
        return new Quantity(value, new Feet());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }
}
