package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RectangleTest {
    @Test
    void calculatingAreaOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(10, 20);
        assertEquals(200, rectangle.area());
    }

    @Test
    void calculatingPerimeterOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(10, 20);
        assertEquals(60, rectangle.perimeter());
    }

    @Test
    void calculatingAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(10);
        assertEquals(100, square.area());
    }

    @Test
    void calculatingPerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(10);
        assertEquals(40, square.perimeter());
    }
}