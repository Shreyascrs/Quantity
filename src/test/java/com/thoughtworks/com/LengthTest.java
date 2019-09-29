package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(0, Unit.Feet).equals(new Length(0, Unit.Feet)));
    }

    @Test
    void givenZeroFeetAndAnotherObject_WhenCompare_ThenTheyShouldNotBeEqual(){
        assertFalse(new Length(0,Unit.Feet).equals(new String("")));
    }

    @Test
    void givenZeroFeetAndNull_WhenCompare_ThenTheyShouldNotBeEqual(){
        assertFalse(new Length(0,Unit.Feet).equals(null));
    }

    @Test
    void givenZeroFeetAndOtherZeroFeet_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue(new Length(0,Unit.Feet).equals(new Length(0,Unit.Feet)));
    }

    @Test
    void givenOneFeetAndAnotherOneFeet_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(1, Unit.Feet).equals(new Length(1, Unit.Feet)));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenCompare_TheyTheyShouldBeEqual() {

        assertTrue(new Length(0, Unit.Inch).equals((new Length(0, Unit.Inch))));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCompare_ThenTheyShouldNotBeEqual() {

        assertFalse(new Length(1, Unit.Feet).equals(new Length(1, Unit.Inch)));
    }

    @Test
    void givenOneFeetAndZeroInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(0, Unit.Feet).equals(new Length(0, Unit.Inch)));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(1, Unit.Feet).equals(new Length(12, Unit.Inch)));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenCompare_ThenTheyShouldBeEqual() {

        assertTrue(new Length(2, Unit.Feet).equals(new Length(24, Unit.Inch)));
    }

    @Test
    void givenTwoFeetAndTwentyFiveInches_WhenCompare_ThenTheyShouldNotBeEqual() {
        assertFalse(new Length(2, Unit.Feet).equals(new Length(25, Unit.Inch)));
    }

    @Test
    void givenOneYardAndAnotherYard_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue((new Length(1,Unit.Yard).equals(new Length(1,Unit.Yard))));
    }
     @Test
    void givenThreeFeetAndOneYard_WhenCompare_ThenTheyShouldBeEqual(){
        assertTrue(new Length(3,Unit.Feet).equals(new Length(1,Unit.Yard)));
     }

    @Test
     void givenZeroInchAndZeroInch_WhenAdd_ThenReturnsZeroInch(){
        assertEquals(new Length(0,Unit.Inch),new Length(0,Unit.Inch).add(new Length(0,Unit.Inch)));
    }

    @Test
    void givenZeroInchAndOneInch_WhenAdd_ThenReturnsOneInch(){
    assertEquals(new Length(1,Unit.Inch),new Length(0,Unit.Inch).add(new Length(1,Unit.Inch)));
    }

    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenReturnsFourInch(){

        assertEquals(new Length(4,Unit.Inch),new Length(2,Unit.Inch).add(new Length(2,Unit.Inch) ));
    }
}
