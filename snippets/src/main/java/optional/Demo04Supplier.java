package optional;

import java.util.Optional;

public class Demo04Supplier {

    public static void main(String[] args) {

        // Use orElseGet() with a supplier
        // The supplier can have any logic to get a default value,
        // like accessing external resource.

        Optional<String> hello = Optional.ofNullable(null);

        String orElse = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // Extra computation...

                    return "string from somewhere else";
                });

        System.out.println(orElse);  // string from somewhere else
    }
}
