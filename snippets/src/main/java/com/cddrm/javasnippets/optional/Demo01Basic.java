package com.cddrm.javasnippets.optional;

import java.util.Optional;

// Introduce Optionals to your codebase and eliminate where
// "null" values are likely to be present

public class Demo01Basic {

    public static void main(String[] args) {

        // 1. Optional.empty()
        // assign an empty Optional
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);                  // Optional.empty
        System.out.println(empty.isPresent());      // always false, 相反的判斷是 isEmpty()

        // 2. Optional.of()
        // use it when you are sure the value is not null
        Optional<String> hello = Optional.of("Hello");
        System.out.println(hello.isPresent());            // always true
        System.out.println(hello.isEmpty());              // always false
        System.out.println(hello);                        // Optional[Hello]
        System.out.println(hello.get());                  // Hello

        // 3. Optional.ofNullable()
        // use it when you are not sure if the value is present

    }
}
