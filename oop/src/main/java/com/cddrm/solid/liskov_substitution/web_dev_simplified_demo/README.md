# Source

Web Dev Simplified

https://youtu.be/dJQMqNOC4Pc

# Definition

If S is a subtype of T, then objects of type T may be replaced with objects 
may be replaced with objects type of S.

If you have a function that accepts a class, every single subclass of that class must also be able
to enter that function and work properly.

## Quick Example

1. Class *Dog* inherits *Animal*
2. Every place that you use the *Animal* class, you should be able to replace it with one of 
its subclasses, which in this case is the *Dog* class. It will work just as well as it did before.

# Bad Code

In this example, the Duck class follows the Liskov Substitution principle since it can
make the makeBirdFly method work properly. There is no error that occurred when we pass in the
Duck class, subclass of the Bird class, into the makeBirdFly method.
However, the Penguin class does not follow the principle since it cannot fly and thus the method
works differently than its parent class which can fly.

*Bird*
```java
abstract public class Bird {

    void fly() {
        System.out.println("I can fly");
    }
}
```

*Duck*
```java
public class Duck extends Bird {

    public void quack() {
        System.out.println("I can quack");
    }
}
```

*Penguin*
```java
public class Penguin extends Bird {

    @Override
    void fly() {
        throw new RuntimeException("Cannot fly");
    }

    public void swim() {
        System.out.println("I can swim");
    }
}
```

Main program
```java
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
```

Result:
```
I can fly
Exception in thread "main" java.lang.RuntimeException: Cannot fly
```

# Good Code

An easy way to fix this is to create a new subclass called FlyingBird class and
also another class called SwimmingBird.

Rename the makeBirdFly method to a more specific name such as "makeFlyingBirdFly".
And then, we make another method for SwimmingBird class called "makeSwimmingBirdSwim".

*FlyingBird*
```java
public class FlyingBird {

    public FlyingBird() {
    }

    void fly() {
        System.out.println("I can fly");
    }
}
```

*SwimmingBird*
```java
public class SwimmingBird {

    public void swim() {
        System.out.println("I can swim");
    }
}
```

*Duck* inherits *FlyingBird*
```java
public class Duck extends FlyingBird {

    public void quack() {
        System.out.println("I can quack");
    }
}
```

*Penguin* inherits *SwimmingBird*
```java
public class Penguin extends SwimmingBird {

}
```

Main program
```java
public class DemoApp {

    public static void main(String[] args) {
        
        FlyingBird flyingBird = new FlyingBird();
        SwimmingBird swimmingBird = new SwimmingBird();

        makeFlyingBirdFly(flyingBird);         // I can fly
        makeSwimmingBirdSwim(swimmingBird);    // I can swim

        // Try the subclasses. The results will be the same.
        FlyingBird duck = new Duck();
        SwimmingBird penguin = new Penguin();

        makeFlyingBirdFly(duck);               // I can fly
        makeSwimmingBirdSwim(penguin);         // I can swim
    }

    private static void makeFlyingBirdFly(FlyingBird flyingBird) {
        flyingBird.fly();
    }

    private static void makeSwimmingBirdSwim(SwimmingBird swimmingBird) {
        swimmingBird.swim();
    }
}
```

Now, this example code is passing the Liskov Substitution principle because every subclass 
of SwimmingBird class is able to properly call makeSwimmingBirdSwim method. Likewise, every 
subclass of FlyingBird class is also able to properly call makeFlyingBirdFly method.

And everything is working as if it was the parent class.

Result:
```
I can fly
I can swim
I can fly
I can swim
```

# Downside

While this approach can solve the Liskov Sub principle issue, it does not cover the fact that
a duck can also swim. To make this work, we will need to add another parent class called
FlyingSwimmingBird since we cannot inherit multiple classes at the same time, which brings
more troublesome work.

# Composition

So, an even better approach for this is called *Composition*, which is an idea of adding
in functionality instead of inheriting functionality.

Composition is much better than Inheritance.

It is important to know that as you start following the Liskov Sub principle, you may
run into issues like this case where you have really complex inheritance trees. And if
you run into this problem, you need to look at Composition as a way to solve that.