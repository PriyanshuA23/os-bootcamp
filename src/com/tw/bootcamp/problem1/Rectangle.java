package com.tw.bootcamp.problem1;

public class Rectangle implements Shape {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }

    public static Rectangle createSquare(double side) {
        return Rectangle.createRectangle(side, side);
    }

    @Override
    public double area(){
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}
