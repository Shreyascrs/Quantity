package com.thoughtworks.com.units.temperature;

import com.thoughtworks.com.NonAddableQuantity;
import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Farenheit implements ITemperature {
    @Override
    public NonAddableQuantity convertToBase(double value) {
        return QuantityFactory.createCelcius((value - 32) * 5.0 / 9);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Farenheit;
    }
}
