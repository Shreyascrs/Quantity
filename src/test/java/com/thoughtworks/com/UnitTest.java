package com.thoughtworks.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void givenZeroGallonAndAnotherZeroGallon_WhenCompare_ThenTheyShouldBeEual(){
        assertEquals(new Quantity(0,Unit.Gallon),new Quantity(0,Unit.Gallon));
    }


}
