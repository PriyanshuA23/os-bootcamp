package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void addingBallsToBag() {
        Bag bag1 = new Bag();
        assertTrue(bag1.add( Ball.YELLOWBALL));
    }

    @Test
    void shouldReturnFalseIfBagIsFull() {
        Bag bag1 = new Bag();
        for (int i = 1; i < 13; i++) {
            bag1.add( Ball.BLUEBALL);
        }
        assertFalse(bag1.add( Ball.BLUEBALL));
    }

    @Test
    void organiseColoredBallInTheBag() {
        Bag bag1 = new Bag();
        for (int i = 1; i < 13; i++) {
            bag1.add(Ball.BLUEBALL);
        }
        assertFalse(bag1.add(Ball.BLUEBALL));
    }

    @Test
    void shouldLimitGreenBallsInABag() {
        Bag bag1 = new Bag();
        for (int i = 1; i <= 3; i++) {
            bag1.add( Ball.GREENBALL);
        }
        assertFalse(bag1.add( Ball.GREENBALL));
    }
}