package com.cddrm.javasnippets.lambda.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;

// In this example, we want to map the name com.cddrm.javasnippets.string to a Person object.
public class ConstructorReferenceDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Dave", "Stanley", "Ian");

        // ** Approach 1: the verbose way -- define a Function instance without com.cddrm.javasnippets.lambda
        Function<String, Person> mapper1 = new Function<String, Person>() {
            @Override
            public Person apply(String name) {
                return new Person(name);
            }
        };
        List<Person> personsVerbose = map(names, mapper1);
        out.println(personsVerbose);

        // ** Approach 2: using com.cddrm.javasnippets.lambda
        // It is smart enough to know it should pass the name com.cddrm.javasnippets.string into apply() method,
        // and the method's return type is Person
        // Finally, the implementation of apply() is 'return new Person(name);'
        Function<String, Person> mapper2 = name -> new Person(name);

        List<Person> personsLambda = map(names, mapper2);
        out.println(personsLambda);

        // ** Approach 3: using constructor reference
        // Constructor is also a method with the return type of the class itself
        // Compare the constructor's signature with the Function interface's
        // They both take a String as the parameter and return a Person object, so
        // we can directly use the constructor for the implementation reference
        List<Person> persons = map(names, Person::new);  // new means the constructor

        // ** Special Instance reference
        // For some special instance, we can use its method for implementation reference
        // 'out' is a PrintStream instance provided by Java
        // This example shows that we can use an existing API as an implementation for the functional interface
        persons.forEach(out::println);
    }

    // java.util.function.Function interface has only one abstract method: R apply(T t)
    // Function interface allows you to map a type into another type, and then
    // we can define how to do the mapping by overriding apply() method
    // The second arg to pass in here is a Function object
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        List<R> mapped = new ArrayList<>();

        for (P p : list) {
            mapped.add(mapper.apply(p));   // we can define how apply should work later
        }

        return mapped;
    }
}

class Person {
    private String name;

    // The constructor's return type is the class itself.
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
