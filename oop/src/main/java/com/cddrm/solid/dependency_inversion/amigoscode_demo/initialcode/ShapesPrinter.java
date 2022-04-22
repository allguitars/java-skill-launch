package com.cddrm.solid.dependency_inversion.amigoscode_demo.initialcode;

import java.util.List;

public class ShapesPrinter {

    // According to Dependency Inversion principle, we should code to the interface,
    // but here we are declaring the areaCalculator using the concrete implementation
    // class AreaCalculator.
    // This code is now depending on the concrete class instead of the abstraction.
    private final AreaCalculator areaCalculator;

    public ShapesPrinter(AreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return String.format("{shapesSum: %s}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("shapes_sum, %s", areaCalculator.sum(shapes));
    }
}
