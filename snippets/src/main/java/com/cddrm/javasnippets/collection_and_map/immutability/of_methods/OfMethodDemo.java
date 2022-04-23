package com.cddrm.javasnippets.collection_and_map.immutability.of_methods;

// After JDK9, we can use the of() method to create unmodifiable objects as a shorthand
// However, unlike unmodifiableXXX() methods, of() method creates a new object, so it
// does not reference to the original objects.

import java.util.*;

public class OfMethodDemo {

    public static void main(String[] args) {
        String[] names = {"Dave", "Stanley"};
        List<String> nameList = List.of(names);

        Set<String> nameSet = Set.of("John", "Irene");
        Map<String, Integer> scoreMap = Map.of("Dave", 100, "John", 90);

        // java.lang.UnsupportedOperationException
        // nameList.add("John");

        // of() method creates a new object instead of referencing to the original one
        names[0] = "Irene";
        System.out.println("names: " + Arrays.toString(names));  // names: [Irene, Stanley]
        System.out.println("nameList: " + nameList);  // nameList: [Dave, Stanley]  --> did not change
    }
}
