package collections.iterable;

// After JDK8, Iterable has a new method forEach() to iterate objects
// so, we don't need to implement forEach() method anymore

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static java.lang.System.out;

public class ForEachDemo {

    public static void main(String[] args) {
        List names = Arrays.asList("Dave", "Stanley", "John");

        names.forEach(name -> System.out.println(name));
        new HashSet(names).forEach(name -> System.out.println(name));
        new ArrayDeque(names).forEach(name -> System.out.println(name));

        out.println("Using Method Reference =============================");
        // After JDK8, we can use Method Reference to make the syntax more simple
        names.forEach(out::println);
        new HashSet(names).forEach(out::println);
        new ArrayDeque(names).forEach(out::println);
    }
}
