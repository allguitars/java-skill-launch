package com.cddrm.solid.interface_segregation.amigoscode_demo.initialcode;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Since Shape has defined the abstract method volume() so Circle also has to
    // implement this method, but it actually is not right.
    @Override
    public double volume() {
        throw new RuntimeException("Circle does not have volume");
    }
}
