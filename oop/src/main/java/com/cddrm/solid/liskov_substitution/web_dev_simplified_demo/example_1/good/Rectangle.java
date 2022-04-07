package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.good;

public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double area() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    void increaseWidth(double increaseLength) {
        this.setWidth(this.getWidth() + increaseLength);
    }
}
