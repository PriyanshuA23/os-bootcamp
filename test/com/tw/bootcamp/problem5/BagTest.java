package com.tw.bootcamp.problem5;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

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

    @Test
    void redBallsShouldBeLessThanDoubleOfGreenBalls() {
        Bag bag1 = new Bag();
        bag1.add(Ball.GREENBALL);
        assertTrue(bag1.add( Ball.REDBALL));
    }

    @Test
    void shouldNotAddIfRedBallsAreGreaterThanDoubleOfGreen() {
        Bag bag1 = new Bag();
        bag1.add(Ball.GREENBALL);
        bag1.add(Ball.REDBALL);
        bag1.add(Ball.REDBALL);
        assertFalse(bag1.add( Ball.REDBALL));
    }
}