package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    Square square;
    @BeforeEach
    void setup() {
        square = new Square(2);
    }
    @Test
    void calculateSquareArea() {
        assertEquals(4, square.area());
    }

    @Test
    void calculateSquarePerimeter() {
        assertEquals(8, square.perimeter());
    }
}
