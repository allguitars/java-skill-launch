package com.cddrm.solid.dependency_inversion.amigoscode_demo.fix;

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
