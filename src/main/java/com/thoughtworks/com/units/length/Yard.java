package com.thoughtworks.com.units.length;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Yard implements ILength {
    private double conversionFactor = 36;

    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createInch(value * conversionFactor);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Yard;
    }
}
