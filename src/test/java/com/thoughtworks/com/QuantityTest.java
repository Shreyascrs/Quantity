package com.thoughtworks.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class QuantityTest {

    @Test
    void givenZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        Quantity zero = new Quantity(0);
        Quantity anotherZero = new Quantity(0);
        Assertions.assertTrue(zero.equals(anotherZero));
    }


    @
}
