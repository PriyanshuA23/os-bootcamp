package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void parkACarInAParkingLot(){
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingLot parkingLot2 = new ParkingLot(10);
        parkingLot.parkACar();
        parkingLot2.parkACar();
        assertEquals(parkingLot, parkingLot2);
    }

    @Test
    void shouldInformWhenIsFull() {
        ParkingLot parkingLot = new ParkingLot(0);
        assertTrue(parkingLot.isFull());
    }
}