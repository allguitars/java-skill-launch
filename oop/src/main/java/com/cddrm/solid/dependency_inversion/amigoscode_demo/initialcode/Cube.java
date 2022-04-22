package com.cddrm.solid.dependency_inversion.amigoscode_demo.initialcode;

public class Cube implements Shape, ThreeDimensionalShape {

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 200;
    }
}
