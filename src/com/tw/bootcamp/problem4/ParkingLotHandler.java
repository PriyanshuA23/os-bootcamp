package com.tw.bootcamp.problem4;

import java.util.Map;

public class ParkingLotHandler {
    private final Map<String, ParkingLot> parkingLots;

    public ParkingLotHandler(Map<String, ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public String parkACar() throws AllParkinLotsAreFullException {
        for (Map.Entry<String, ParkingLot> parkingLotInfo : parkingLots.entrySet()) {
            ParkingLot parkingLot = parkingLotInfo.getValue();
            if(!parkingLot.isFull()) {
                return parkingLot.parkACar();
            }
        }

        throw new AllParkinLotsAreFullException("No parking lots available");
    }
}
