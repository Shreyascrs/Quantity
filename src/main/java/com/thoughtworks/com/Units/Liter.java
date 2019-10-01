package com.thoughtworks.com.Units;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Liter implements IVolume {
    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createLiter(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Liter;
    }
}
