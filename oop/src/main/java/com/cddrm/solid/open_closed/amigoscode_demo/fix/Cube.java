package com.cddrm.solid.open_closed.amigoscode_demo.fix;

public class Cube implements Shape {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return 100;
    }
}
