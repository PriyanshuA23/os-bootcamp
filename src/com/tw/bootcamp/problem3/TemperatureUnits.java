package com.tw.bootcamp.problem3;

public enum TemperatureUnits {
    CELSIUS(1),
    FAHRENHEIT(212);

    private final double unit;

    TemperatureUnits(double unit) {
        this.unit = unit;
    }
}
