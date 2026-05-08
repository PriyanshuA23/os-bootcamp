package com.tw.bootcamp.problem3;

public class Inches {
    private final double value;

    public Inches(double value) {
        this.value = value;
    }

    public Centimeter convertToBaseUnit() {
        return Centimeter.createCentimeter(2.5 * value);
    }
}
