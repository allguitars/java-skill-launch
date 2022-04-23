package com.cddrm.javasnippets.optional.book_se14;

import java.util.Map;
import java.util.Optional;

public class Demo4OfNullable {

    public static void main(String[] args) {
        Optional<String> nickOptional = getNickname("Duke");

        System.out.println(nickOptional.orElse("Openhome Reader"));
    }

    // mock db access
    static Optional<String> getNickname(String name) {
        Map<String, String> nicknames = Map.of(
                "Justin", "caterpiller",
                "Monica", "momor",
                "Irene", "hamimi"
        );

//        String nickname = nicknames.get(name);
//        return nickname == null ?
//                Optional.empty() :
//                Optional.of(nickname);

        // Optional.ofNullable() is an alternative way to write above code.
        // Behind the scenes, it calls empty() if the return value is null,
        // otherwise it calls of().
        return Optional.ofNullable(nicknames.get(name));
    }
}
