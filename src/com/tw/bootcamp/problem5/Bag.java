package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final int maxLimitOfGreenBalls;
    private final HashMap<Ball,Integer> balls;
    private int occupied;

    public Bag() {
        this.capacity = 12;
        this.occupied = 0;
        balls = new HashMap<>();
        balls.put(Ball.BLUEBALL,0);
        balls.put(Ball.GREENBALL,0);
        balls.put(Ball.REDBALL,0);
        balls.put(Ball.YELLOWBALL,0);
        this.maxLimitOfGreenBalls = 3;
    }
    
    public Boolean add(Ball ball) {
        if (isBagFull()) return false;
        int ballCount = balls.get(ball);

        if(Ball.GREENBALL == ball && ballCount == 3) {
            return false;
        }

        occupied++;

        balls.put(ball, ++ballCount);
        return true;

    }

    private boolean isBagFull() {
        return  occupied == capacity;
    }
}
