package com.cddrm.solid.liskov_substitution.amigoscode_demo.initialcode;

// implement Shape for Open-Closed
// then implement the area() method
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
}
