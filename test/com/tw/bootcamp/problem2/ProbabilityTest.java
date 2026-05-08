package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probabilityOfGettingTailForACoin() {
        Probability probabilityOfGettingTail = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.5), probabilityOfGettingTail);
    }

    @Test
    void probabilityOfNotgettingTailForACoin() {
        Probability probabilityOfNotGettingTail = Probability.createProbability(0.5).not();
        assertEquals(Probability.createProbability(0.5), probabilityOfNotGettingTail);
    }

    @Test
    void probabilityOfGettingAtleastOneTailForTwoCoins() {
        Probability probabilityOfTail = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(.75), probabilityOfTail.or(probabilityOfTail));
    }

    @Test
    void probabilityOfGettingBothTailsForTwoCoins() {
        Probability probabilityOfTail = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(.25), probabilityOfTail.and(probabilityOfTail));
    }

    @Test
    void probabilityOfGettingThreeOnDice() {
        Probability probabilityOfGettingThreeOnDice = Probability.createProbability(0.75);
        assertEquals(Probability.createProbability(0.75), probabilityOfGettingThreeOnDice);
    }

    @Test
    void creatingInvalidChanceShouldThrowsError() {
        assertThrows(InvalidProbabilityException.class, () -> Probability.createProbability(75));
    }
}