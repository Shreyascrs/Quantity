package com.thoughtworks.com.units.weight;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Gram implements IWeight {
    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createGram(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gram;
    }
}
