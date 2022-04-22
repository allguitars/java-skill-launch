package com.cddrm.solid.dependency_inversion.amigoscode_demo.fix;

import java.util.List;

// Extract this class to an interface call IAreaCalculator and
// do the implementation here.
public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}