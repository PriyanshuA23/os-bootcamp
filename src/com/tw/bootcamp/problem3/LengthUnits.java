package com.tw.bootcamp.problem3;

public enum LengthUnits {
    FEET(30),
    CENTIMETER(1),
    INCHES(2.5), MILLIMETER(0.1);
    private final double baseCentimeterValue;

    LengthUnits(double baseCentimeterValue) {
        this.baseCentimeterValue = baseCentimeterValue;
    }

    double convertToBase(double value) {
        return this.baseCentimeterValue * value;
    }

    public double convertToInch(double length) {
        return  length / LengthUnits.INCHES.baseCentimeterValue;
    }
}
