package com.thoughtworks.com.units.weight;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Gram implements IWeight {
//    Quantity gram;
    @Override
    public Quantity convertToBase(double value) {
        Quantity gram = QuantityFactory.createGram(value);
        return gram;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gram;
    }

//    @Override
//    public String toString() {
//        return "Gram{" +
//                "gram=" + gram +
//                '}';
//    }
}
