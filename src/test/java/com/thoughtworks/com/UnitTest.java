package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {

    @Test
    void givenZeroFeet_WhenConvertToBase_ThenConvertToInch() {

        Quantity expected = new Quantity(0, Unit.Inch);
        Quantity actual = Unit.Feet.convertToBase(new Quantity(0, Unit.Feet));

        assertEquals(expected.getUnit(), actual.getUnit());
    }

    @Test
    void givenOneFeet_WhenConvertToBase_ThenConvertToInch() {

        Quantity expected = new Quantity(12, Unit.Inch);
        Quantity actual = Unit.Feet.convertToBase(new Quantity(1, Unit.Feet));

        assertEquals(expected.getUnit(), actual.getUnit());
        assertEquals(expected.value, actual.value);
    }

    @Test
    void givenOneYard_WhenConvertToBase_ThenConvertToInch() {

        Quantity expected = new Quantity(36, Unit.Inch);
        Quantity actual = Unit.Yard.convertToBase(new Quantity(1, Unit.Yard));


        assertEquals(expected.getUnit(), actual.getUnit());
        assertEquals(expected.value, actual.value);
    }

    @Test
    void givenOneGallon_WhenConvertToBase_ThenConvertToLiter() {

        Quantity expected = new Quantity(3.78, Unit.Liter);
        Quantity actual = Unit.Gallon.convertToBase(new Quantity(1, Unit.Gallon));


        assertEquals(expected.getUnit(), actual.getUnit());
        assertEquals(expected.value, actual.value);
    }

}
