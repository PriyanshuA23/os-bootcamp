package com.tw.bootcamp.problem4;

import java.util.Map;

public class ParkingLotHandler {
    private final Map<String, ParkingLot> parkingLots;

    private ParkingLotHandler(Map<String, ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public static ParkingLotHandler createParkingLotHandler(Map<String, ParkingLot> parkingLots) {
        return new ParkingLotHandler(parkingLots);
    }

    public boolean parkACar() throws AllParkinLotsAreFullException {
        for (Map.Entry<String, ParkingLot> parkingLotInfo : parkingLots.entrySet()) {
            ParkingLot parkingLot = parkingLotInfo.getValue();
            if(!parkingLot.isFull()) {
                return parkingLot.parkACar();
            }
        }
        return false;
    }
}
