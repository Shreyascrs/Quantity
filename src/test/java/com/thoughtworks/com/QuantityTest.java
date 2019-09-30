package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        Quantity quantityFeet = Quantity.createFeet(0);
        Quantity anotherQuantityFeet = Quantity.createFeet(0);
        assertTrue(quantityFeet.equals(anotherQuantityFeet));
    }

    @Test
    void givenZeroFeetAndAnotherObject_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityFeet = Quantity.createFeet(0);
        assertFalse(quantityFeet.equals(new String("")));
    }

    @Test
    void givenZeroFeetAndNull_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityFeet = Quantity.createFeet(0);
        assertFalse(quantityFeet.equals(null));
    }

    @Test
    void givenOneFeetAndAnotherOneFeet_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityFeet = Quantity.createFeet(1);
        Quantity anotherquantityFeet = Quantity.createFeet(1);
        assertTrue(quantityFeet.equals(anotherquantityFeet));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenCompare_TheyTheyShouldBeEqual() {
        Quantity quantityInch = Quantity.createInch(0);
        Quantity anotherQuantityInch = Quantity.createInch(0);
        assertTrue(quantityInch.equals(anotherQuantityInch));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityInch = Quantity.createInch(1);
        Quantity quantityFeet = Quantity.createFeet(1);
        assertFalse(quantityInch.equals(quantityFeet));
    }


    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityOneFeet = Quantity.createFeet(1);
        Quantity quantitytewleveInch = Quantity.createInch(12);
        assertTrue(quantityOneFeet.equals(quantitytewleveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityOneFeet = Quantity.createFeet(2);
        Quantity quantityTwentyFOurInch = Quantity.createInch(24);
        assertTrue(quantityOneFeet.equals(quantityTwentyFOurInch));
    }

    @Test
    void givenTwoFeetAndTwentyFiveInches_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityOneFeet = Quantity.createFeet(2);
        Quantity quantityTwentyFiveInch = Quantity.createInch(25);
        assertFalse(quantityOneFeet.equals(quantityTwentyFiveInch));
    }

    @Test
    void givenOneYardAndAnotherYard_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity anotherOneYard = Quantity.createYard(1);
        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenThreeFeetAndOneYard_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity threeFeet = Quantity.createFeet(3);
        Quantity oneYard = Quantity.createYard(1);
        assertTrue(threeFeet.equals(oneYard));
    }


    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenTheyShouldBeFourInch() {
        Quantity twoInch = Quantity.createInch(2);
        Quantity anothertwoInch = Quantity.createInch(2);
        assertEquals(Quantity.createInch(4), twoInch.add(anothertwoInch));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenTheyShouldBeThireteenInch() {
        Quantity oneFeet = Quantity.createFeet(1);
        Quantity oneInch = Quantity.createInch(1);
        assertEquals(Quantity.createInch(13), oneFeet.add(oneInch));
    }


    @Test
    void givenZeroGallonAndZeroLiters_WhenCompare_TheyShouldBeEqual() {
        Quantity zeroGallon = Quantity.createGallon(0);
        Quantity anotherZeroGallon = Quantity.createGallon(0);
        assertEquals(Quantity.createGallon(0), zeroGallon.add(anotherZeroGallon));
    }

    @Test
    void givenOneGallonAndThreeDotSevenEightLiters_WhenCompare_TheyShouldBeEqual() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity ThreePonitSevenEight = Quantity.createLiter(3.78);
        assertTrue(oneGallon.equals(ThreePonitSevenEight));
    }

    @Test
    void givenOneFeetAndONeLiter_WhenEqual_TheyShouldThrowException() {
        Quantity quantityFeet = Quantity.createFeet(1);
        Quantity quantityInch = Quantity.createInch(12);
        assertEquals(true, quantityFeet.equals(quantityInch));
    }

    @Test
    void givenOneGallonAndOneFeet_WhenEqual_ThenMustThrowException() {
        Quantity oneGallon = Quantity.createGallon(1);
        Quantity oneFeet = Quantity.createFeet(1);
        assertFalse(oneFeet.equals(oneGallon));
    }
}
