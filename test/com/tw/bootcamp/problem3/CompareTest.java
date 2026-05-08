package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @Test
    void compareLengthsInFeetAndInches() {
        Compare compare = new Compare(1,12);
        assertEquals(true,compare.feetAndInches());

    }

}