package com.thoughtworks.com.units.weight;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Kg implements IWeight {

    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createGram(value * 1000);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Kg;
    }
}
