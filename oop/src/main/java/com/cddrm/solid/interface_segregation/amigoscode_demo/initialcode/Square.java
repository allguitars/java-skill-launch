package com.cddrm.solid.interface_segregation.amigoscode_demo.initialcode;

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

    // Since Shape has defined the abstract method volume() so Square also has to
    // implement this method, but it actually is not right.
    @Override
    public double volume() {
        throw new RuntimeException("Square does not have volume");
    }
}
