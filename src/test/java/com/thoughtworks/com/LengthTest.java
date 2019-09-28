package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(0, Unit.Feet).equals(new Length(0, Unit.Feet)));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenCompare_TheyTheyShouldBeEqual() {

        assertTrue(new Length(0, Unit.Inch).equals((new Length(0, Unit.Inch))));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCompare_ThenTheyShouldNotBeEqual() {

        assertFalse(new Length(1, Unit.Feet).equals(new Length(1, Unit.Inch)));
    }

}
