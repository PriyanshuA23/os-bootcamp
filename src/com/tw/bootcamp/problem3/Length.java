package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnits lengthUnits;

    public Length(double value, LengthUnits lengthUnits) {
        this.value = value;
        this.lengthUnits = lengthUnits;
    }

    public boolean compareLength(Length lenght) {
        return Double.compare(lengthUnits.convertToBase(value), lenght.lengthUnits.convertToBase(lenght.value)) == 0;
    }

    public Length add(Length length) {
        double addedLength = lengthUnits.convertToBase(value) + length.lengthUnits.convertToBase(length.value);
        return new Length(lengthUnits.convertToInch(addedLength), LengthUnits.INCHES);
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
