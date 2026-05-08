package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {
    private final double value;
    private final VolumeUnits volumeUnits;

    private Volume(double value, VolumeUnits volumeUnits) {
        this.value = value;
        this.volumeUnits = volumeUnits;
    }

    public static Volume createVolume(double value, VolumeUnits volumeUnits) {
        return new Volume(value, volumeUnits);
    }

    public boolean compareVolumes(Volume volume) {
        return Double.compare(volumeUnits.convertToBase(value), volume.volumeUnits.convertToBase(volume.value)) == 0;
    }

    public Volume add(Volume length) {
        double addedLength = volumeUnits.convertToBase(value) + length.volumeUnits.convertToBase(length.value);
        return createVolume(volumeUnits.convertToLiter(addedLength), VolumeUnits.LITERS);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return Math.abs(value - volume.value) < 0.01 && volumeUnits == volume.volumeUnits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, volumeUnits);
    }
}
