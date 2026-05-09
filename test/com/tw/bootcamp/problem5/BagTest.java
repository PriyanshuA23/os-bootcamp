package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void addingBallsToBag() {
        Bag bag1 = new Bag(12);
        assertTrue(bag1.add(new Ball()));
    }
}