package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void calculateSquareArea() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    void calculateSquarePerimeter() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
    }
}
