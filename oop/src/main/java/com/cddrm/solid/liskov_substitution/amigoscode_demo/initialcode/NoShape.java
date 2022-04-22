package com.cddrm.solid.liskov_substitution.amigoscode_demo.initialcode;

// This NoShape class implements Shape, but it cannot calculate the area
// This broke the Liskov Substitution principle
public class NoShape implements Shape {

    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
