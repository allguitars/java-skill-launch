package com.cddrm.solid.single_responsibility.amigoscode_demo.initialcode;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {
        int sum = 0;

        for (Object shape : shapes) {
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum;
    }

    // at some point, we want add another method here to return the sum of area with JSON format
    // This breaks the single responsibility rule
    // This method is just for generating the JSON string of the result, and it does not have
    // anything to do with the area calculation.
    // This means it does not belong here and should have its own class.
    public String json(List<Object> shapes) {
        return String.format("{sum: %s}", sum(shapes));
    }

    // break the single responsibility
    public String csv(List<Object> shapes) {
        return String.format("sum, %s", sum(shapes));
    }
}