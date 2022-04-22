package com.cddrm.solid.open_closed.amigoscode_demo.fix;

import java.util.List;

public class OpenClosedFixDemo {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);

        List<Shape> shapes = List.of(circle, square, cube);

        int sum = areaCalculator.sum(shapes);
        ShapesPrinter printer = new ShapesPrinter();

        System.out.println("sum = " + sum);
        System.out.println("JSON of sum: " + printer.json(sum));
        System.out.println("CSV format:\n" + printer.csv(sum));
    }
}
