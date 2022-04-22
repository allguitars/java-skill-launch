package com.cddrm.solid.open_closed.amigoscode_demo.fix;

public class ShapesPrinter {

    public String json(int sum) {
        return String.format("{shapesSum: %s}", sum);
    }

    public String csv(int sum) {
        return String.format("shapes_sum, %s", sum);
    }
}
