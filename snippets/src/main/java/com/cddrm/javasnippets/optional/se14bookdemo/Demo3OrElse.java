package com.cddrm.javasnippets.optional.se14bookdemo;

import java.util.Map;
import java.util.Optional;

public class Demo3OrElse {

    public static void main(String[] args) {
        Optional<String> nickOptional = getNickname("Duke");

        // With orElse(), we can specify the alternative value and make the code more clean
        System.out.println(nickOptional.orElse("Openhome Reader"));
    }

    // mock db access
    static Optional<String> getNickname(String name) {
        Map<String, String> nicknames = Map.of(
                "Justin", "caterpiller",
                "Monica", "momor",
                "Irene", "hamimi"
        );

        String nickname = nicknames.get(name);

        return nickname == null ?
                Optional.empty() :
                Optional.of(nickname);
    }
}
