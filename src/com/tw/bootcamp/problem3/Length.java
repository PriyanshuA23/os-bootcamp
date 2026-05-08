package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double i;
    private final Units units;

    public Length(double i, Units units) {
        this.i = i;
        this.units = units;
    }

    public Length convertToBaseUnit() {
        return new Length(units.convertToBase(this.i), Units.CENTIMETER);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(i, length.i) == 0 && units == length.units;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, units);
    }
}
