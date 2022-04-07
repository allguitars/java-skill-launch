package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_2.failure_demo;

/**
 * In this example, the Duck class follows the Liskov Substitution principle since it can
 * make the makeBirdFly method work properly. There is no error that occurred when we pass in the
 * Duck class, subclass of the Bird class into the makeBirdFly method.
 * However, the Penguin class does not follow the principle since it cannot fly and thus the method
 * works differently than its parent class which can fly.
 */

public class DemoApp {

    public static void main(String[] args) {

        Bird duck = new Duck();
        Bird penguin = new Penguin();

        makeBirdFly(duck);
        makeBirdFly(penguin);
    }

    private static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}
