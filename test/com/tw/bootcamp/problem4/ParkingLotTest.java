package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void parkACarInAParkingLot(){
        ParkingLot parkingLot = ParkingLot.createParkingLot(10, "P1");
        assertTrue(parkingLot.parkACar());
    }

    @Test
    void shouldInformWhenIsFull() {
        ParkingLot parkingLot = ParkingLot.createParkingLot(1, "P1");
         parkingLot.parkACar();
        assertTrue(parkingLot.isFull());
    }

    @Test
    void handleMoreThanOneParkingLot() throws AllParkinLotsAreFullException {
        Map<String, ParkingLot> parkingLots = new HashMap<>();
        ParkingLot parkingLot1 = ParkingLot.createParkingLot(10, "P1");
        ParkingLot parkingLot2 = ParkingLot.createParkingLot(10, "P2");
        parkingLots.put("P1", parkingLot1);
        parkingLots.put("P2", parkingLot2);
        ParkingLotHandler parkingLotHandler = ParkingLotHandler.createParkingLotHandler(parkingLots);
        assertTrue(parkingLotHandler.parkACar());
    }
}