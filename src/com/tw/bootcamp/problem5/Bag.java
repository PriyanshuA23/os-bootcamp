package com.tw.bootcamp.problem5;

import java.util.HashMap;

public class Bag {
    private final int capacity;
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
    }
    
    public Boolean add(Ball ball) {
        if (isBagFull()) return false;
        int ballCount = balls.get(ball);

        if(Ball.GREENBALL == ball && ballCount == 3) {
            return false;
        }

        if (Ball.REDBALL == ball && !isLessOrDoubleOfGreenBall(ballCount)) {
            return false;
        }

        occupied++;
        balls.put(ball, (ballCount + 1));
        return true;
    }


    private boolean isLessOrDoubleOfGreenBall(int ballCount) {
        int greenBalls = balls.get(Ball.GREENBALL);

        return ballCount <  (2 * greenBalls);
    }

    private boolean isBagFull() {
        return  occupied == capacity;
    }

}
