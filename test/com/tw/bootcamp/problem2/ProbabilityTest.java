package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void chanceOfGettingTail() {
        Probability probability = new Probability();
        float tailPossibility = probability.chanceOfGettingTail(1);
        assertEquals(0.5, tailPossibility);
    }

    @Test
    void chanceOfNotGettingTail() {
        Probability probability = new Probability();
        float tailPossibility = probability.chanceOfNotGettingTail(1);
        assertEquals(0.5, tailPossibility);
    }
}