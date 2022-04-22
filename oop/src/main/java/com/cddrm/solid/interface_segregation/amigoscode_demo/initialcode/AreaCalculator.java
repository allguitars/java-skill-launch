package com.cddrm.solid.interface_segregation.amigoscode_demo.initialcode;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Shape> shapes) {
        int sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}