package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Quantity(0, Unit.Feet).equals(new Quantity(0, Unit.Feet)));
    }

    @Test
    void givenZeroFeetAndAnotherObject_WhenCompare_ThenTheyShouldNotBeEqual(){
        assertFalse(new Quantity(0,Unit.Feet).equals(new String("")));
    }

    @Test
    void givenZeroFeetAndNull_WhenCompare_ThenTheyShouldNotBeEqual(){
        assertFalse(new Quantity(0,Unit.Feet).equals(null));
    }

    @Test
    void givenZeroFeetAndOtherZeroFeet_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue(new Quantity(0,Unit.Feet).equals(new Quantity(0,Unit.Feet)));
    }

    @Test
    void givenOneFeetAndAnotherOneFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Quantity(1, Unit.Feet).equals(new Quantity(1, Unit.Feet)));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenCompare_TheyTheyShouldBeEqual() {

        assertTrue(new Quantity(0, Unit.Inch).equals((new Quantity(0, Unit.Inch))));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCompare_ThenTheyShouldNotBeEqual() {

        assertFalse(new Quantity(1, Unit.Feet).equals(new Quantity(1, Unit.Inch)));
    }

    @Test
    void givenOneFeetAndZeroInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Quantity(0, Unit.Feet).equals(new Quantity(0, Unit.Inch)));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Quantity(1, Unit.Feet).equals(new Quantity(12, Unit.Inch)));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Quantity(2, Unit.Feet).equals(new Quantity(24, Unit.Inch)));
    }

    @Test
    void givenTwoFeetAndTwentyFiveInches_WhenCompare_ThenTheyShouldNotBeEqual() {
        assertFalse(new Quantity(2, Unit.Feet).equals(new Quantity(25, Unit.Inch)));
    }

    @Test
    void givenOneYardAndAnotherYard_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue((new Quantity(1,Unit.Yard).equals(new Quantity(1,Unit.Yard))));
    }
     @Test
    void givenThreeFeetAndOneYard_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue(new Quantity(3,Unit.Feet).equals(new Quantity(1,Unit.Yard)));
     }

    @Test
     void givenZeroInchAndZeroInch_WhenAdd_ThenReturnsZeroInch(){
        assertEquals(new Quantity(0,Unit.Inch),new Quantity(0,Unit.Inch).add(new Quantity(0,Unit.Inch)));
    }

    @Test
    void givenZeroInchAndOneInch_WhenAdd_ThenReturnsOneInch(){
    assertEquals(new Quantity(1,Unit.Inch),new Quantity(0,Unit.Inch).add(new Quantity(1,Unit.Inch)));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenTheyShouldBeFourInch(){
        assertEquals(new Quantity(4,Unit.Inch),new Quantity(2,Unit.Inch).add(new Quantity(2,Unit.Inch) ));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenTheyShouldBeThireteenInch(){
        assertEquals(new Quantity(13,Unit.Inch),new Quantity(1,Unit.Feet).add(new Quantity(1,Unit.Inch) ));
    }

    @Test
    void givenxzOneFeetAndTwoInch_WhenAdd_ThenTheyShouldBeFourteenInch(){
        assertEquals(new Quantity(14,Unit.Inch),new Quantity(1,Unit.Feet).add(new Quantity(2,Unit.Inch) ));
    }

    @Test
    void givenTwoInchAndOneFeet_WhenAdd_ThenTheyShouldBeFourteenInch(){
        assertEquals(new Quantity(14,Unit.Inch),new Quantity(2,Unit.Inch).add(new Quantity(1,Unit.Feet) ));
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCompare_TheyShouldBeEqual(){
        assertEquals(new Quantity(0,Unit.Gallon),new Quantity(0,Unit.Liter));
    }

    @Test
    void givenOneGallonAndThreeDotSevenEightLiters_WhenCompare_TheyShouldBeEqual(){
        assertEquals(new Quantity(1,Unit.Gallon),new Quantity(3.78,Unit.Liter));
    }


}
