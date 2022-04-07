package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.good;

public class Square extends Shape {

    public Square(double sideLength) {
        super(sideLength);
    }

    @Override
    public double area() {
        return this.getSideLength() * this.getSideLength();
    }

    @Override
    void increaseWidth(double increaseLength) {
        this.setSideLength(this.getSideLength() + 1);
    }
}
