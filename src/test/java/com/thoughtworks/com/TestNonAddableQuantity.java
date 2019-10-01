package com.thoughtworks.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNonAddableQuantity {

    @Test
    void givenZeroCelciusAndAnotherZeroCelcius_WhenEquals_ThenMustBeEqual() {

        assertEquals(QuantityFactory.createCelcius(0), QuantityFactory.createCelcius(0));

    }

    @Test
    void  givenOneCelciusAndAnotherOneCelcius_WhenEquals_ThenMustbeEqual(){

        assertEquals(QuantityFactory.createCelcius(1.0),QuantityFactory.createCelcius(1.0));
    }
}
