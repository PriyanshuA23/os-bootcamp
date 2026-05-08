package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Centimeter {
    private final double value;

    private Centimeter(double value) {
        this.value = value;
    }

    public static Centimeter createCentimeter(double value) {
        return new Centimeter(value);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Centimeter that)) return false;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
