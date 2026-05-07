package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chance chance)) return false;
        return Double.compare(probability, chance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }
}