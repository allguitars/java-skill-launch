package com.cddrm.solid.liskov_substitution.amigoscode_demo.initialcode;

public class ShapesPrinter {

    public String json(int sum) {
        return String.format("{shapesSum: %s}", sum);
    }

    public String csv(int sum) {
        return String.format("shapes_sum, %s", sum);
    }
}
