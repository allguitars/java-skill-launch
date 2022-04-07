package com.cddrm.solid.liskov_substitution.web_dev_simplified_demo.example_2.solution;

/**
 * An easy way to fix this is to create a new subclass called FlyingBird class and
 * also another class called SwimmingBird.
 *
 * Rename the makeBirdFly method to a more specific name such as "makeFlyingBirdFly".
 * And then, we make another method for SwimmingBird class called "makeSwimmingBirdSwim".
 *
 * Now, this example code is passing the Liskov Substitution principle because every subclass
 * of SwimmingBird class is able to properly call makeSwimmingBirdSwim method. Likewise, every
 * subclass of FlyingBird class is also able to properly call makeFlyingBirdFly method.
 *
 * And everything is working as if it was the parent class.
 *
 * Downside:
 * While this approach can solve the Liskov Sub principle issue, it does not cover the fact that
 * a duck can also swim. To make this work, we will need to add another parent class called
 * FlyingSwimmingBird since we cannot inherit multiple classes at the same time, which brings
 * more troublesome work.
 *
 * So, an even better approach for this is called *Composition*, which is an idea of adding
 * in functionality instead of inheriting functionality.
 * -> Composition is much better than Inheritance.
 *
 * It is important to know that as you start following the Liskov Sub principle, you may
 * run into issues like this case where you have really complex inheritance trees. And if
 * you run into this problem, you need to look at Composition as a way to solve that.
 */

public class DemoApp {

    public static void main(String[] args) {

        FlyingBird duck = new Duck();
        SwimmingBird penguin = new Penguin();

        makeFlyingBirdFly(duck);               // I can fly
        makeSwimmingBirdSwim(penguin);         // I can swim

        // Try the parent classes. The results will be the same.
        FlyingBird flyingBird = new FlyingBird();
        SwimmingBird swimmingBird = new SwimmingBird();

        makeFlyingBirdFly(flyingBird);         // I can fly
        makeSwimmingBirdSwim(swimmingBird);    // I can swim
    }

    private static void makeFlyingBirdFly(FlyingBird flyingBird) {
        flyingBird.fly();
    }

    private static void makeSwimmingBirdSwim(SwimmingBird swimmingBird) {
        swimmingBird.swim();
    }
}
