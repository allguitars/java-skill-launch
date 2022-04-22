package com.cddrm.solid.liskov_substitution.amigoscode_demo.initialcode;

public class Cube implements Shape {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(length, 3);
    }
}
