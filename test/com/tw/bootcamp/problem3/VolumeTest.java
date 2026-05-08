package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareGallonAndLiters() {
        Volume volumeInGallons = new Volume(1, VolumeUnits.GALLON);
        Volume volumeInLiters = new Volume(3.78, VolumeUnits.LITERS);
        assertTrue(volumeInGallons.compareVolumes(volumeInLiters));
    }

}