package com.cddrm.solid.interface_segregation.amigoscode_demo.fix;

// Cube is a 3D shape so it can implement the ThreeDimensionalShape interface which
// gives it the ability to calculate the volume.

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
