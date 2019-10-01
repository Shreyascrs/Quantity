package com.thoughtworks.com.units;

import com.thoughtworks.com.NonAddableQuantity;

public interface INonAddableUnit {

    NonAddableQuantity convertToBase(double value);
}
