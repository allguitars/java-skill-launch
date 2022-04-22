package com.cddrm.solid.dependency_inversion.amigoscode_demo.fix;

import java.util.List;

public class DependencyInversionFixDemo {

    public static void main(String[] args) {

        // Use interface on the left-hand side and
        // specify the real implementation on the right-hand side.
        IAreaCalculator areaCalculator = new AreaCalculator();

        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape cube = new Cube(10);

        List<Shape> shapes = List.of(circle, square, cube);

        int sum = areaCalculator.sum(shapes);

        ShapesPrinter printer = new ShapesPrinter(areaCalculator);

        System.out.println("sum = " + sum);
        System.out.println("JSON of sum: " + printer.json(shapes));
        System.out.println("CSV format:\n" + printer.csv(shapes));
    }
}
