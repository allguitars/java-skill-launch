package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.bad;

/**
 * We know that every square is a rectangle.
 */

public class Square extends Rectangle {

    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
