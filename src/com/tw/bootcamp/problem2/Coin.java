package com.tw.bootcamp.problem2;

public class Coin {
    CoinFace HEAD = CoinFace.Head;
    CoinFace TAIL = CoinFace.Tail;

    public float chanceOfGettingTail() {
        return ((float) 1 /CoinFace.values().length);
    }
}
