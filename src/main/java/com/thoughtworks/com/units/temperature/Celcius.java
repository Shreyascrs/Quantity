package com.thoughtworks.com.units.temperature;

import com.thoughtworks.com.NonAddableQuantity;
import com.thoughtworks.com.Quantity;
import com.thoughtworks.com.QuantityFactory;

public class Celcius implements ITemperature {
    @Override
    public NonAddableQuantity convertToBase(double value) {
        return QuantityFactory.createCelcius(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celcius;
    }
}
