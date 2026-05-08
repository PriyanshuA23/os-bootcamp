package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability createProbability(double probability) {
        if(probability < 0.0 || probability > 1.0) {
            throw new InvalidProbabilityException("Invalid probability");
        }
        return new Probability(probability);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability probability)) return false;
        return Double.compare(this.probability, probability.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability not() {
        return createProbability(1 - probability);
    }

    public Probability or(Probability probability) {
        return createProbability(this.probability + probability.probability - (this.probability * probability.probability));
    }

    public Probability and(Probability probabilityOfTail) {
        return createProbability(probabilityOfTail.probability * probability);
    }
}