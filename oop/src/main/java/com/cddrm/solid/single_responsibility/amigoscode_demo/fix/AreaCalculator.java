package com.cddrm.solid.single_responsibility.amigoscode_demo.fix;

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
}