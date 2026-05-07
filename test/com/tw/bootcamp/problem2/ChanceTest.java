package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void chanceOfNotTailForACoin() {
        Chance chanceOfGettingTail = new Chance(0.5);
        assertEquals(new Chance(0.5), chanceOfGettingTail);
    }

    @Test
    void chanceOfNotgettingTailForACoin() {
        Chance chanceOfNotGettingTail = new Chance(0.5).not();
        assertEquals(new Chance(0.5), chanceOfNotGettingTail);
    }

    @Test
    void chanceOfGettingAtleastOneTailForTwoCoin() {
        Chance chanceOfTail = new Chance(0.5);
        assertEquals(new Chance(.75), chanceOfTail.alteastOnce(chanceOfTail));
    }

    @Test
    void chanceOfGettingThreeOnDice() {
        Chance chanceOfGettingThreeOnDice = new Chance(0.75);
        assertEquals(new Chance(0.75), chanceOfGettingThreeOnDice);
    }
}