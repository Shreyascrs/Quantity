package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void givenZeroGallonAndAnotherZeroGallon_WhenCompare_ThenTheyShouldBeEqual(){
//        assertEquals(new Quantity(0,Unit.Gallon),new Quantity(0,Unit.Gallon));
        assertEquals(Quantity.createGallon(0),Quantity.createGallon(0));
    }

    @Test
    void givenZeroLiterAndZeroLiter_WhenCompare_ThenTheyShouldBeEqual(){
    assertEquals(Quantity.createLiter(0),Quantity.createLiter(0));
    }

}
