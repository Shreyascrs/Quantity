package com.thoughtworks.com.Units;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Inch implements ILengths {

    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createInch(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Inch;
    }
}
