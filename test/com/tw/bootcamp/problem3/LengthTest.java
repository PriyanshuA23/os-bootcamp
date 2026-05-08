package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareFeetAndInches() {
        Length oneFeet = Length.createLength(1, LengthUnits.FEET);
        Length twelveInches = Length.createLength(12, LengthUnits.INCHES);
        assertTrue(oneFeet.compareLength(twelveInches));
    }

    @Test
    void compareCentimeterAndInches() {
        Length lengthInCM = Length.createLength(5, LengthUnits.CENTIMETER);
        Length lengthInInches = Length.createLength(2, LengthUnits.INCHES);
        assertTrue(lengthInCM.compareLength(lengthInInches));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Length lengthInCM = Length.createLength(1, LengthUnits.CENTIMETER);
        Length lengthInMillimeter = Length.createLength(10, LengthUnits.MILLIMETER);
        assertTrue(lengthInCM.compareLength(lengthInMillimeter));
    }

    @Test
    void addTwoLengthsInInches() {
        Length lengthInInches = Length.createLength(2, LengthUnits.INCHES);
        assertEquals(Length.createLength(4, LengthUnits.INCHES), lengthInInches.add(lengthInInches));
    }

    @Test
    void addTwoLengthsInAnyUnitReturnInch() {
        Length lengthInInches = Length.createLength(2, LengthUnits.INCHES);
        Length lengthInCentimeter = Length.createLength(2.5, LengthUnits.CENTIMETER);
        assertEquals(Length.createLength(3, LengthUnits.INCHES), lengthInInches.add(lengthInCentimeter));
    }
}