package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnits lengthUnits;

    private Length(double value, LengthUnits lengthUnits) {
        this.value = value;
        this.lengthUnits = lengthUnits;
    }

    public static Length createLength(double value, LengthUnits lengthUnits) {
        return new Length(value, lengthUnits);
    }

    public boolean compareLength(Length length) {
        return Double.compare(lengthUnits.convertToBase(value), length.lengthUnits.convertToBase(length.value)) == 0;
    }

    public Length add(Length length) {
        double addedLength = lengthUnits.convertToBase(value) + length.lengthUnits.convertToBase(length.value);
        return createLength(lengthUnits.convertToInch(addedLength), LengthUnits.INCHES);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(value, length.value) == 0 && lengthUnits == length.lengthUnits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, lengthUnits);
    }
}
