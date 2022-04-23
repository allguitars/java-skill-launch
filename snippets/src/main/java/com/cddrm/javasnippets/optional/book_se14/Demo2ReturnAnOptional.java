package com.cddrm.javasnippets.optional.book_se14;

import java.util.Map;
import java.util.Optional;

public class Demo2ReturnAnOptional {

    public static void main(String[] args) {
        Optional<String> nickOptional = getNickname("Duke");
        String nickname = "Openhome Reader";  // default value

        // Use isPresent() to check if the value exists
        if(nickOptional.isPresent()) {
            nickname = nickOptional.get();
        }

        // Even we don't use isPresent() to check the value and call get() directly,
        // it will cause NoSuchElementException right away when the Optional instance is empty.
        // This way we can achieve "Fail Fast".
        // String nickname = nickOptional.get();

        System.out.println(nickname);
    }

    // mock db access
    static Optional<String> getNickname(String name) {
        Map<String, String> nicknames = Map.of(
                "Justin", "caterpiller",
                "Monica", "momor",
                "Irene", "hamimi"
        );

        String nickname = nicknames.get(name);

        // 1. If the value is null, we call empty() to create an Optional instance which
        // does not wrap any value.
        // 2. If the value exists, we call of() to wrap the value and create the Optional instance.
        return nickname == null ?
                Optional.empty() :
                Optional.of(nickname);
    }
}
