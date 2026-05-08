package com.tw.bootcamp.problem3;

public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public Centimeter convertToBaseUnit() {
        return Centimeter.createCentimeter(value * 30);
    }


}
