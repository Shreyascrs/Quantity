package com.thoughtworks.com.units.volume;

import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Gallon implements IVolume {
    private double conversionFactor = 3.78;

    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createLiter(value * conversionFactor);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Gallon;
    }
}
