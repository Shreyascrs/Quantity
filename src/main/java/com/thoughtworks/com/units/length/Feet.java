package com.thoughtworks.com.units.length;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Feet implements ILength {

    private final double conversionFactor=12;
    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createInch(value*conversionFactor);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Feet;
    }
}
