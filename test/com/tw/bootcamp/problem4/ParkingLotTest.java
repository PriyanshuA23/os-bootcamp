package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void parkACarInAParkingLot(){
        ParkingLot parkingLot = ParkingLot.createParkingLot(10, "P1");
        String lotId = parkingLot.parkACar();
        assertEquals("P1", lotId);
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
        ParkingLotHandler parkingLotHandler = new ParkingLotHandler(parkingLots);
        String parkingLotId = parkingLotHandler.parkACar();
        assertEquals("P1",parkingLotId);
    }
}