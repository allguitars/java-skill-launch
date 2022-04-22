package com.cddrm.solid.open_closed.amigoscode_demo.initialcode;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {
        int sum = 0;

        // This block deals all types of shape
        // What if we have a new shape?
        // We need to come in here and add more logic to take care of the new shape
        // Then we broke the rule of Open-Closed principle
        // This class is Not "closed for modification"
        for (Object shape : shapes) {
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            // we need to add a conditional here for the Cube
            // Each time we have a new shape we need to add a new if statement
            if (shape instanceof Cube) {
                //
            }
        }
        return sum;
    }
}