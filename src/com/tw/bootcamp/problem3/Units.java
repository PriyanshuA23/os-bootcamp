package com.tw.bootcamp.problem3;

public enum Units {
    FEET(30),
    CENTIMETER(1),
    INCHES(2.5), MILLIMETER(0.1);
    private final double baseCentimeterValue;

    Units(double baseCentimeterValue) {
        this.baseCentimeterValue = baseCentimeterValue;
    }

    double convertToBase(double value) {
        return this.baseCentimeterValue * value;
    }
}
