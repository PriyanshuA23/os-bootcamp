package com.tw.bootcamp.problem4;

public class AllParkinLotsAreFullException extends Throwable {
    public AllParkinLotsAreFullException(String noParkingLotsAvailable) {
        super(noParkingLotsAvailable);
    }
}
