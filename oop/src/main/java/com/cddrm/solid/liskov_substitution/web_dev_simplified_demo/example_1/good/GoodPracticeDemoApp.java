package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.good;

public class GoodPracticeDemoApp {

    public static void main(String[] args) {

        Shape rect1 = new Rectangle(10, 2);
        Shape rect2 = new Rectangle(5, 5);

        increaseWidth(rect1, 1);
        increaseWidth(rect2, 1);

        System.out.println(rect1.area());  // 22
        System.out.println(rect2.area());  // 30

        Shape rect3 = new Square(5);
        increaseWidth(rect3, 1);
        System.out.println(rect3.area());     // 36
    }

    private static void increaseWidth(Shape shape, double increaseLength) {
        shape.increaseWidth(increaseLength);
    }
}
