package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.Objects;

public class ParkingLot {

    private final ArrayList<String> parkingLot;
    private final String id;
    private final int parkingLotSize;

    private ParkingLot(int parkingLotSize, String id) {
        this.parkingLotSize = parkingLotSize;
        this.parkingLot = new ArrayList<>(parkingLotSize);
        this.id = id;
    }

    public static ParkingLot createParkingLot(int parkingLotSize, String id) {
        return new ParkingLot(parkingLotSize, id);
    }

    public String parkACar() {
        parkingLot.add("car");
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ParkingLot that)) return false;
        return parkingLotSize == that.parkingLotSize && Objects.equals(parkingLot, that.parkingLot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkingLot, parkingLotSize);
    }

    public boolean isFull() {
        return parkingLot.size() == parkingLotSize;
    }
}
