package optional;

import java.util.Optional;

public class Demo03ImperativeVsDeclarative {

    public static void main(String[] args) {

        // ==== Imperative ====
        String hey = null;
        String world;

        if (hey != null) {
            world = "something";
        }

        // ==== Declarative ====
        // We can chain methods
        // map() allows us to do transformation on the actual value inside the Optional
        // if it is present

        // 1.
        Optional<String> hello = Optional.ofNullable("hello");
        String orElse = hello
                .map(String::toUpperCase)    // in the case where the value is present
                .orElse("world");

        System.out.println(orElse);          // HELLO

        // 2.
        Optional<String> hello2 = Optional.ofNullable(null);
        String orElse2 = hello2
                .map(String::toUpperCase)
                .orElse("world");       // in the case where the Optional is null

        System.out.println(orElse2);          // world
    }
}
