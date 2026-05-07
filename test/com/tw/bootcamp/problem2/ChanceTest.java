package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void chanceOfGettingTailForACoin() {
        Chance chanceOfGettingTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5), chanceOfGettingTail);
    }

    @Test
    void chanceOfNotgettingTailForACoin() {
        Chance chanceOfNotGettingTail = Chance.createChance(0.5).not();
        assertEquals(Chance.createChance(0.5), chanceOfNotGettingTail);
    }

    @Test
    void chanceOfGettingAtleastOneTailForTwoCoins() {
        Chance chanceOfTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(.75), chanceOfTail.or(chanceOfTail));
    }

    @Test
    void chanceOfGettingBothTailsForTwoCoins() {
        Chance chanceOfTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(.25), chanceOfTail.and(chanceOfTail));
    }

    @Test
    void chanceOfGettingThreeOnDice() {
        Chance chanceOfGettingThreeOnDice = Chance.createChance(0.75);
        assertEquals(Chance.createChance(0.75), chanceOfGettingThreeOnDice);
    }

    @Test
    void creatingInvalidChanceShouldThrowsError() {
        assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(75));
    }
}