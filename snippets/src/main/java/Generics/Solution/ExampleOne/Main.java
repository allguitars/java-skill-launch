package Generics.Solution.ExampleOne;

public class Main {

    public static void main(String[] args) {
        // What gets passed into the class as a generic needs to be an Object type, instead of a Primitive.
        MyClass<Integer> obj = new MyClass<>(10);
        MyClass<Double> obj2 = new MyClass<>(20.0);

        obj.showType();
        obj2.showType();
    }
}
