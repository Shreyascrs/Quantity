package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QuantityTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Feet(0).equals(new Feet(0)));
    }

}
