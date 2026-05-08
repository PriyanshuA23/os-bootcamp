package com.tw.bootcamp.problem3;

public class Volume {
    private final double value;
    private final VolumeUnits volumeUnits;

    public Volume(double value, VolumeUnits volumeUnits) {
        this.value = value;
        this.volumeUnits = volumeUnits;
    }

    public boolean compareVolumes(Volume volume) {
        return Double.compare(volumeUnits.convertToBase(value), volume.volumeUnits.convertToBase(volume.value)) == 0;
    }
}
