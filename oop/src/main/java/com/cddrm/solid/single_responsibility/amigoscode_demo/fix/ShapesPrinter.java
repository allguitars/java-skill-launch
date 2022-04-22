package com.cddrm.solid.single_responsibility.amigoscode_demo.fix;

// Now, we have a dedicated class to deal with the formatting
public class ShapesPrinter {

    public String json(int sum) {
        return String.format("{shapesSum: %s}", sum);
    }

    public String csv(int sum) {
        return String.format("shapes_sum, %s", sum);
    }
}
