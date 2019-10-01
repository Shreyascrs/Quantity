package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.com.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndAnotherZeroFeet_WhenCompare_ThenTheyShouldBeEqual() {

        Quantity quantityFeet = createFeet(0);
        Quantity anotherQuantityFeet = createFeet(0);

        assertTrue(quantityFeet.equals(anotherQuantityFeet));
    }

    @Test
    void givenZeroFeetAndAnotherObject_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityFeet = createFeet(0);

        assertFalse(quantityFeet.equals(new String("")));
    }

    @Test
    void givenZeroFeetAndNull_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityFeet = createFeet(0);

        assertFalse(quantityFeet.equals(null));
    }

    @Test
    void givenOneFeetAndAnotherOneFeet_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityFeet = createFeet(1);
        Quantity anotherquantityFeet = createFeet(1);

        assertTrue(quantityFeet.equals(anotherquantityFeet));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenCompare_TheyTheyShouldBeEqual() {
        Quantity quantityInch = createInch(0);
        Quantity anotherQuantityInch = createInch(0);

        assertTrue(quantityInch.equals(anotherQuantityInch));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityInch = createInch(1);
        Quantity quantityFeet = createFeet(1);

        assertFalse(quantityInch.equals(quantityFeet));
    }


    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityOneFeet = createFeet(1);
        Quantity quantitytewleveInch = createInch(12);

        assertTrue(quantityOneFeet.equals(quantitytewleveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity quantityOneFeet = createFeet(2);
        Quantity quantityTwentyFOurInch = createInch(24);

        assertTrue(quantityOneFeet.equals(quantityTwentyFOurInch));
    }

    @Test
    void givenTwoFeetAndTwentyFiveInches_WhenCompare_ThenTheyShouldNotBeEqual() {
        Quantity quantityOneFeet = createFeet(2);
        Quantity quantityTwentyFiveInch = createInch(25);

        assertFalse(quantityOneFeet.equals(quantityTwentyFiveInch));
    }

    @Test
    void givenOneYardAndAnotherYard_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity oneYard = createYard(1);
        Quantity anotherOneYard = createYard(1);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenThreeFeetAndOneYard_WhenCompare_ThenTheyShouldBeEqual() {
        Quantity threeFeet = createFeet(3);
        Quantity oneYard = createYard(1);

        assertTrue(threeFeet.equals(oneYard));
    }


    @Test
    void givenTwoInchAndTwoInch_WhenAdd_ThenTheyShouldBeFourInch() {
        Quantity twoInch = createInch(2);
        Quantity anothertwoInch = createInch(2);

        assertEquals(createInch(4), twoInch.add(anothertwoInch));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenTheyShouldBeThireteenInch() {
        Quantity oneFeet = createFeet(1);
        Quantity oneInch = createInch(1);

        assertEquals(createInch(13), oneFeet.add(oneInch));
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCompare_TheyShouldBeEqual() {
        Quantity zeroGallon = createGallon(0);
        Quantity anotherZeroGallon = createGallon(0);

        assertEquals(createGallon(0), zeroGallon.add(anotherZeroGallon));

    }

    @Test
    void givenOneGallonAndThreeDotSevenEightLiters_WhenCompare_TheyShouldBeEqual() {
        Quantity oneGallon = createGallon(1);
        Quantity ThreePonitSevenEight = createLiter(3.78);

        assertTrue(oneGallon.equals(ThreePonitSevenEight));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEqual_TheyShouldTrue() {
        Quantity quantityFeet = createFeet(1);
        Quantity quantityInch = createInch(12);

        assertEquals(true, quantityFeet.equals(quantityInch));
    }

    @Test
    void givenOneGallonAndOneFeet_WhenEqual_ThenMustFalse() {
        Quantity oneGallon = createGallon(1);
        Quantity oneFeet = createFeet(1);

        assertFalse(oneFeet.equals(oneGallon));
    }

    @Test
    void givenOneGallonAndOneFeet_WhenAdd_ThenMustThrowException() {
        Quantity oneGallon = createGallon(1);
        Quantity oneFeet = createFeet(1);

        assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneGallon));
    }

    @Test
    void givenOneLiterAndOneFeet_WhenAdd_ThenMustThrowException() {
        Quantity oneLiter = createLiter(1);
        Quantity oneFeet = createFeet(1);

        Throwable excption = assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneLiter));
        assertEquals("Two Different Quantity can't be added", excption.getMessage());
    }
}
