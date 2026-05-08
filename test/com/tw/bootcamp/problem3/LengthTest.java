package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareFeetAndInches() {
        Length oneFeet = new Length(1, Units.FEET);
        Length twelveInches = new Length(12, Units.INCHES);
        assertTrue(oneFeet.convertToBaseUnit().equals(twelveInches.convertToBaseUnit()));
    }

    @Test
    void compareCentimeterAndInches() {
        Length lengthInCM = new Length(5, Units.CENTIMETER);
        Length lengthInInches = new Length(2, Units.INCHES);
        assertTrue(lengthInCM.convertToBaseUnit().equals(lengthInInches.convertToBaseUnit()));
    }

    @Test
    void compareCentimeterAndMillimeter() {
        Length lengthInCM = new Length(1, Units.CENTIMETER);
        Length lengthInMillimeter = new Length(10, Units.MILLIMETER);
        assertTrue(lengthInCM.convertToBaseUnit().equals(lengthInMillimeter.convertToBaseUnit()));
    }
}