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

    @Test
    void chanceOfGettingTailsWhenTwoCoinsFlipped() {
        Probability probability = new Probability();
        float tailPossibility = probability.chanceOfNotGettingTail(2);
        assertEquals(0.75, tailPossibility);
    }

    @Test
    void probabilityOfGettingANumberOnDice() {
        Probability probability = new Probability();
        float possibilityOfGettingANumber = probability.gettingANumberOnDice();
        assertEquals(0.16, possibilityOfGettingANumber,0.2);
    }
}