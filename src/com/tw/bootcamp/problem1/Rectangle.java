package com.tw.bootcamp.problem1;

public class Rectangle implements Shape {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int area(){
        return length * breadth;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
