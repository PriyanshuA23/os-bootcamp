package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareGallonAndLiters() {
        Volume volumeInGallons = Volume.createVolume(1, VolumeUnits.GALLON);
        Volume volumeInLiters = Volume.createVolume(3.78, VolumeUnits.LITERS);
        assertTrue(volumeInGallons.compareVolumes(volumeInLiters));
    }

    @Test
    void addingTwoVolumeOfAnyUnit() {
        Volume volumeGallon = Volume.createVolume(1, VolumeUnits.GALLON);
        Volume volumeInLiters = Volume.createVolume(1, VolumeUnits.LITERS);
        assertEquals(Volume.createVolume(4.78, VolumeUnits.LITERS), volumeGallon.add(volumeInLiters));
    }
}