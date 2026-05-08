package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareFeetAndInches() {
        Length oneFeet = new Length(1, LengthUnits.FEET);
        Length twelveInches = new Length(12, LengthUnits.INCHES);
        assertTrue(oneFeet.compareLength(twelveInches));
    }

    @Test
    void compareCentimeterAndInches() {
        Length lengthInCM = new Length(5, LengthUnits.CENTIMETER);
        Length lengthInInches = new Length(2, LengthUnits.INCHES);
        assertTrue(lengthInCM.compareLength(lengthInInches));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Length lengthInCM = new Length(1, LengthUnits.CENTIMETER);
        Length lengthInMillimeter = new Length(10, LengthUnits.MILLIMETER);
        assertTrue(lengthInCM.compareLength(lengthInMillimeter));
    }

    @Test
    void addTwoLengthsInInches() {
        Length lengthInInches = new Length(2, LengthUnits.INCHES);
        assertEquals(new Length(4, LengthUnits.INCHES), lengthInInches.add(lengthInInches));
    }

    @Test
    void addTwoLengthsInAnyUnitReturnInch() {
        Length lengthInInches = new Length(2, LengthUnits.INCHES);
        Length lengthInCentimeter = new Length(2.5, LengthUnits.CENTIMETER);
        assertEquals(new Length(3, LengthUnits.INCHES), lengthInInches.add(lengthInCentimeter));
    }
}