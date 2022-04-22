package com.cddrm.solid.interface_segregation.amigoscode_demo.initialcode;

// A cube actually has volume, and for the Cube class to have the ability to calculate volume,
// we add the abstract method to the interface Shape.
// This breaks the rule of Interface Segregation principle
public class Cube implements Shape {

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
