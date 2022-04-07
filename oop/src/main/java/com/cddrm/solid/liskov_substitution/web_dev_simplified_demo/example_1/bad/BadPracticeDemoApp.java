package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_1.bad;

public class BadPracticeDemoApp {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(10, 2);
        Rectangle rect2 = new Rectangle(5, 5);

        increaseRectangleWidth(rect1);
        increaseRectangleWidth(rect2);

        System.out.println("Area: " + rect1.area());  // 22
        System.out.println("Area: " + rect2.area());  // 30

        /**
         * Now if we use the Square class instead of Rectangle
         * The area method's behavior will change, which will return 36 instead of 30.
         * So, when we substitute the Rectangle class with its subclass Square, it will
         * break the Liskov Substitution principle
         */

        Rectangle rect3 = new Square(5,5);
        increaseRectangleWidth(rect3);
        System.out.println("Area: " + rect3.area());  // 36

        /**
         * The problem is that our subclass Square is not actually compatible with
         * every function that we are using our rectangle for, in this case, the
         * increaseRectangleWidth() function.
         * Our Square cannot be substituted in place of a Rectangle, so now we are failing
         * the principle.
         */

        /**
         * Solution:
         * One of the easiest ways to fix this would be to change what we are inheriting from.
         * Let's create another class called Shape.
         */
    }

    private static void increaseRectangleWidth(Rectangle rectangle) {
        rectangle.setWidth(rectangle.getWidth() + 1);
    }
}
