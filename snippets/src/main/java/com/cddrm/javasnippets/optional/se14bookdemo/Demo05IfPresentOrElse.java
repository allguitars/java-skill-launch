package com.cddrm.javasnippets.optional.se14bookdemo;

import java.util.Map;
import java.util.Optional;

public class Demo05IfPresentOrElse {

    public static void main(String[] args) {

        // ifPresentOrElse() 有兩個參數，分別放兩個 Lambda 表示式
        // 第一個表示式在回傳值呼叫 isPresent() 為 true 時執行，第二個則是 false 時執行。

        // 雖然 getNickname 函式定義有回傳 Optional
        // 但是在使用 ifPresentOrElse 的情況下，可以不需要去另外宣告一個變數接收回傳值。
        getNickname("Duke")
                .ifPresentOrElse(
                        nickname -> System.out.println(nickname),
                        () -> System.out.println("Hello, Guest!")
                );

        // 搭配 method reference
        getNickname("Justin")
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Hello, Guest!")
                );
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
