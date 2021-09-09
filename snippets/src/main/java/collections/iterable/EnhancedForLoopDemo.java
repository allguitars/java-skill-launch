package collections.iterable;

// for (Object o : iterable) { }
// Enhanced for loop can be used on ant object that implements Iterable
// It's a syntax sugar for iterator methods: hasNext() and next()

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EnhancedForLoopDemo {

    public static void main(String[] args) {
        List names = Arrays.asList("Dave", "Stanley", "John");

        // List is an Iterable
        forEach(names);

        // HashSet has a constructor that takes a Collection, and List is a Collection
        // so, we pass the List into this constructor to create a HashSet
        // Also, Set is an Iterable
        forEach(new HashSet(names));

        // ArrayDeque has a constructor that takes a Collection, and List is a Collection
        // so, we pass the List into this constructor to create an ArrayDeque
        // Also, ArrayDeque is an Iterable
        forEach(new ArrayDeque(names));
    }

    static void forEach(Iterable iterable) {
        // enhanced for loop
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }
}
