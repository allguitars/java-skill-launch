package com.cddrm.javasnippets.collection_and_map.immutability.of_methods;

// If we really want the element (Student object) to be immutable, we can use
// final keyword

import java.util.List;

public class ElementLayerCorrectDemo {

    public static void main(String[] args) {
        ImmutableStudent student = new ImmutableStudent("Justin");

        List<ImmutableStudent> students = List.of(student);

        // Compilation error; name is final
        // student.name = "Monica";

        students.add(new ImmutableStudent("Monica"));  // java.lang.UnsupportedOperationException
    }
}

class ImmutableStudent {
    final String name;

    ImmutableStudent (String name) {
        this.name = name;
    }
}