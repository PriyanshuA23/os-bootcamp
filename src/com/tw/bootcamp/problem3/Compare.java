package com.tw.bootcamp.problem3;

public class Compare {
    private final int unit1;
    private final int unit2;

    public Compare(int unit1, int unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public boolean feetAndInches() {
        int convertedFeetToInches = unit1 * 12;
        return convertedFeetToInches == unit2;
    }
}
