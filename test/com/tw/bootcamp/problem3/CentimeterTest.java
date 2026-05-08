package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void compareFeetAndInches() {
        Feet oneFeet = new Feet(1);
        Inches oneInches = new Inches(12);
        Centimeter baseUnitOfFeet = oneFeet.convertToBaseUnit();
        assertTrue(baseUnitOfFeet.equals(oneInches.convertToBaseUnit()));
    }

    @Test
    void compareInchesAndCentimeter() {
        Centimeter centimeter = Centimeter.createCentimeter(5);
        Inches oneInches = new Inches(2);
        assertTrue(centimeter.equals(oneInches.convertToBaseUnit()));
    }
}