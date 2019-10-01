package com.thoughtworks.com.units;

import com.thoughtworks.com.Quantity;

public interface IUnit {

    public Quantity convertToBase(double value);

}
