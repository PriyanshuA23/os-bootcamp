package com.tw.bootcamp.problem2;

public class Probability {

    public float chanceOfGettingTail(int noOfCoins) {
        return ((float) 1 /(noOfCoins * 2));
    }

    public float chanceOfNotGettingTail(int noOfCoins) {
        return 1 - chanceOfGettingTail(noOfCoins);
    }
}
