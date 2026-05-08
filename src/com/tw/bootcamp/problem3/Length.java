package com.tw.bootcamp.problem3;

public class Length {
    private final double value;
    private final Units units;

    public Length(double value, Units units) {
        this.value = value;
        this.units = units;
    }

    public boolean compareLength(Length lenght) {
        return Double.compare(units.convertToBase(value), lenght.units.convertToBase(lenght.value)) == 0;
    }
}
