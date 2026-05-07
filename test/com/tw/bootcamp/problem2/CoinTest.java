package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void chanceOfGettingTail() {
        Coin coin = new Coin();
        float tailPossibility = coin.chanceOfGettingTail();
        assertEquals(0.5, tailPossibility);
    }
}