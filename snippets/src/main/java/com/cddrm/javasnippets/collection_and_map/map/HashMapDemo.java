package com.cddrm.javasnippets.collection_and_map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("Dave", "Hi there!");
        messages.put("Stanley", "Nice to meet you");
        messages.put("John", "Have a nice day");

        System.out.println(messages);  // There is no specific order for the keys in a HashMap

        Scanner console = new Scanner(System.in);
        System.out.println("Which message do you want to check? ");
        String message = messages.get(console.nextLine());
        System.out.println("Message: " + message);

    }
}
