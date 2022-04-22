package com.cddrm.solid.open_closed.amigoscode_demo.fix;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Shape> shapes) {
        int sum = 0;

        // now all the if statements are all gone
        // whenever we have a new shape, we do not need to come in here to add more code
        // however, this program is still "open for extension", meaning
        // we just need to add a new class for the new shape and implement the Shape interface
        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}