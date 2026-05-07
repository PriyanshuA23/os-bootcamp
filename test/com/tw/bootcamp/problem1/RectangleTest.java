package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setup() {
         rectangle = new Rectangle(10, 20);
    }
    @Test
    void calculatingAreaOfRectangle() {
        assertEquals(200, rectangle.area());
    }

    @Test
    void calculatingPerimeterOfRectangle() {
        assertEquals(60, rectangle.perimeter());
    }
}