package com.tw.bootcamp.problem3;

public class Temperature {
    private final double value;
    private final TemperatureUnits unit;

    public Temperature(double value, TemperatureUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean areEqual(Temperature temperature) {
        return false;
    }
}
