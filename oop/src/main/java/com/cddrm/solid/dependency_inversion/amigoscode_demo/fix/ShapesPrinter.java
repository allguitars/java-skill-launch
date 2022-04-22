package com.cddrm.solid.dependency_inversion.amigoscode_demo.fix;

import java.util.List;

// Dependency Inversion:
// Components should depend on abstractions, not on concretions.

public class ShapesPrinter {

    // Code to the interface here and use dependency injection
    // ** Then the control on the true implementation will depend on the one who
    // uses this class, in this case the main class.

    // So, go to the main class we use the following statement to "control" which implementation
    // to use:
    // IAreaCalculator areaCalculator = new AreaCalculator();

    // ** The real dependency / implementation is counting on others, so we
    // call this "Dependency Inversion", aka "Inversion of Control"

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return String.format("{shapesSum: %s}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("shapes_sum, %s", areaCalculator.sum(shapes));
    }
}
