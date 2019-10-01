package com.thoughtworks.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNonAddableQuantity {

    @Test
    void givenZeroCelciusAndAnotherZeroCelcius_WhenEquals_ThenMustBeEqual() {

        assertEquals(QuantityFactory.createCelcius(0), QuantityFactory.createCelcius(0));

    }
}
