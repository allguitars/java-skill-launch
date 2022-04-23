package com.cddrm.javasnippets.optional;

import java.util.Optional;

public class Demo05Consumer {

    public static void main(String[] args) {

        // ifPresent() takes the value inside the Optional if it is present
        // and then feed it to the Consumer for doing com.cddrm.javasnippets.other job

        Optional<String> hello = Optional.ofNullable("Hello");

        hello.ifPresent(word -> {
            System.out.println(word);  // Hello
        });

        // Consumer and Runnable
        Optional<String> hello2 = Optional.ofNullable(null);

        hello2.ifPresentOrElse(word -> {          // default world
            System.out.println(word);
        }, () -> {
            System.out.println("default world");
        });
    }
}
