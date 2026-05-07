package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RectangleTest {

    @Test
    void calculatingAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        int area = rectangle.area();
        assertEquals(200, area);
    }
}