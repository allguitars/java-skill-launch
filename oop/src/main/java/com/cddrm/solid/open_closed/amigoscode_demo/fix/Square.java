package com.cddrm.solid.open_closed.amigoscode_demo.fix;

// implement Shape for Open-Closed
public class Square implements Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
