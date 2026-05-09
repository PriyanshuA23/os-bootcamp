package com.tw.bootcamp.problem5;

import java.util.ArrayList;

public class Bag {
    private final int capacity;
    private final ArrayList<Ball> bag;
    private int occupied;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.bag = new ArrayList<>(capacity);
        this.occupied = 0;
    }

    public Boolean add(Ball ball) {
        occupied++;
        return bag.add(ball);
    }
}
