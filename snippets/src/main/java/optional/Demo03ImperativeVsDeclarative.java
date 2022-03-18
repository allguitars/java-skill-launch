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
        Optional<String> hello = Optional.ofNullable("hello");
        String orElse = hello
                .map(String::toUpperCase)    // in the case where the value is present
                .orElse("world");

        System.out.println(orElse);          // HELLO
    }
}
