package com.cddrm.solid.liskov_substitution.amigoscode_demo.initialcode;

import java.util.List;

// I don't think Amigoscode gives a good explanation about this one
// also, there is no fix for this demo
public class LiskovSubstitutionInitialDemo {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape cube = new Cube(10);
        // we add a NoShape object and pass it into the list
        Shape noShape = new NoShape();

        // this will cause an IllegalStateException
        List<Shape> shapes = List.of(noShape, circle, square, cube);
        
        int sum = areaCalculator.sum(shapes);
        ShapesPrinter printer = new ShapesPrinter();

        System.out.println("sum = " + sum);
        System.out.println("JSON of sum: " + printer.json(sum));
        System.out.println("CSV format:\n" + printer.csv(sum));
    }
}
