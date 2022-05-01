package com.cddrm.javasnippets.optional.se14bookdemo;

import java.util.Map;
import java.util.Optional;

public class Demo6OrMethod {

    public static void main(String[] args) {

        // or() method 接受一個 Lambda 表示式做為參數
        // 當呼叫函式回傳 empty，則使用該表示式取得替代值。

        Optional<String> nicknameOptional = getNickname("Duke").or(
                () -> Optional.of("Hello, Guest!")
        );

        System.out.println(nicknameOptional.get());
    }

    // mock db access
    static Optional<String> getNickname(String name) {
        Map<String, String> nicknames = Map.of(
                "Justin", "caterpiller",
                "Monica", "momor",
                "Irene", "hamimi"
        );

        return Optional.ofNullable(nicknames.get(name));
    }
}
