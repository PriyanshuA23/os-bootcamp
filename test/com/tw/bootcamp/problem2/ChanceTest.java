package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void chanceOfNotGettingTailForACoin() {
        Chance chanceOfGettingTail = new Chance(0.5);
        assertEquals(new Chance(0.5), chanceOfGettingTail);
    }

    @Test
    void chanceOfNotgettingTailForACoin() {
        Chance chanceOfNotGettingTail = new Chance(0.5);
        assertEquals(new Chance(0.5), chanceOfNotGettingTail);
    }

    @Test
    void changeOfGettingTailsForTwoCoin() {
        Chance chanceOfGettingTailForTwoCoin = new Chance(0.75);
        assertEquals(new Chance(0.75), chanceOfGettingTailForTwoCoin);
    }
}