package com.cddrm.solid.single_responsibility.amigoscode_demo.initialcode;

import java.util.List;

public class SOLIDPrinciplesDemo {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);

        List<Object> shapes = List.of(circle, square);

        int sum = areaCalculator.sum(shapes);
        String sumJson = areaCalculator.json(shapes);
        String sumCsv = areaCalculator.csv(shapes);

        System.out.println("sum = " + sum);
        System.out.println("JSON of sum: " + sumJson);
        System.out.println("CSV format:\n" + sumCsv);
    }
}
