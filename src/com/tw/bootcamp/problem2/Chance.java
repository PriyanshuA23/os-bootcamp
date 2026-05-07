package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private final double probability;

    private Chance(double probability) {
        this.probability = probability;
    }

    public static Chance createChance(double probability) {
        if(probability < 0.0 || probability > 1.0) {
            throw new InvalidProbabilityException("Invalid probability");
        }
        return new Chance(probability);
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

    public Chance not() {
        return createChance(1 - probability);
    }

    public Chance or(Chance chance) {
        return createChance(probability + chance.probability - (probability * chance.probability));
    }

    public Chance and(Chance chanceOfTail) {
        return createChance(chanceOfTail.probability * probability);
    }
}