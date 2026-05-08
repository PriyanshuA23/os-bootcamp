package com.tw.bootcamp.problem3;

public enum VolumeUnits {
    GALLON(3.78), LITERS(1);

    private final double baseUnitValue;

    VolumeUnits(double baseUnitValue) {
        this.baseUnitValue = baseUnitValue;
    }

    public double convertToBase(double value) {
        return value * this.baseUnitValue;
    }

    public double convertToLiter(double volume) {
        return volume / VolumeUnits.LITERS.baseUnitValue;
    }
}
