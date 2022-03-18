package optional;

import java.util.Optional;

// orElse() Give default value when the value inside the Optional is not present

public class Demo02OrElse {

    public static void main(String[] args) {

        // Case 1: Optional.of("Hello")
        // =============================================================
        Optional<String> hello = Optional.of("Hello");

        String orElse = hello.orElse("How are you?");
        System.out.println(orElse);                                // Hello


        // Case 2: Optional.of(null)
        // =============================================================
        // This will get an NullPointerException since Optional.of() assures value exists.
        // We should use Optional.ofNullable()

        // Optional<Object> hello2 = Optional.of(null);           // Causes NullPointerException

        // String orElse2 = (String) hello2.orElse("Am I null?");
        // System.out.println(orElse2);


        // Case 3: Optional.ofNullable(null)
        // =============================================================
        // Use ofNullable()
        Optional<Object> hello3 = Optional.ofNullable(null);
        String orElse3 = (String) hello3.orElse("Is it OK to be null?");
        System.out.println(orElse3);                              // Is it OK to be null?
    }
}
