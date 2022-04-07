package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.good;

/**
 * Now, both Rectangle and Square inherit from Shape
 */

abstract public class Shape {

    // Rectangle
    private double width;
    private double height;

    // Square
    private double sideLength;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    abstract double area();

    abstract void increaseWidth(double increaseLength);

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
