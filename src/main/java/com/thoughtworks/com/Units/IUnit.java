package com.thoughtworks.com.Units;

import com.thoughtworks.com.Quantity;

public interface IUnit {

    public Quantity convertToBase(double value);

}
