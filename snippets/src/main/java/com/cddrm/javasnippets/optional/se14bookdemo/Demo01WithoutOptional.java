package com.cddrm.javasnippets.optional.se14bookdemo;

import java.util.Map;

// We need to take care of the case where the getNickname() method returns null.
// If we do not check nullity of the returned value, then the program continues
// executing until it reaches the point accessing the nickname variable.

// This program is relatively simple, but what if we are writing a huge application
// and there is much more logic between calling of getNickname() and printing
// out the nickname. This might cause a lot of trouble.

// We can use Optional to force the user to check the nullity if the returned value
public class Demo01WithoutOptional {

    public static void main(String[] args) {
        String nickname = getNickname("Duke");

        if(nickname == null) {
            nickname = "Openhome Reader";
        }

        // what if the user does not check the null value?
        // -> the nickname will be null and some com.cddrm.javasnippets.other part of this program
        // will show strange value of null
        System.out.println(nickname);
    }

    static String getNickname(String name) {
        // mock db access
        Map<String, String> nicknames = Map.of(
                "Justin", "caterpiller",
                "Monica", "momor",
                "Irene", "hamimi"
        );

        return nicknames.get(name);
    }
}
